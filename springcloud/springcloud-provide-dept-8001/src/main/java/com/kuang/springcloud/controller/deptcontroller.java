package com.kuang.springcloud.controller;

import com.kuang.springcloud.pojo.dept;
import com.kuang.springcloud.service.deptservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class deptcontroller {

    @Autowired
    private  deptservice deptservice;

    @PostMapping("/add")
    public boolean addDept(@RequestBody dept dept) {
        return deptservice.addDept(dept);
    }
    @GetMapping("/get/{id}")
    public dept get(@PathVariable("id") Long id) {
        return deptservice.queryById(id);
    }
    @GetMapping("/list")
    public List<dept> queryAll() {
        return deptservice.queryAll();
    }

}
