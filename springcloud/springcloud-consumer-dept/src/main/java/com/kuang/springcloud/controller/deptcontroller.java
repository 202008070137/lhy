package com.kuang.springcloud.controller;

import com.kuang.springcloud.pojo.dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
public class deptcontroller {

    @Autowired
    private RestTemplate restTemplate;
    //做Ribbon时候将此改为了微服务名字
//private static final String REST_URL_PREFIX = "http://localhost:8001";
   private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";


    @RequestMapping("/consumer/dept/get{id}")
    private  dept get(@PathVariable("id") Long id)
    {
      return  restTemplate.getForObject(REST_URL_PREFIX+"/dept/get"+id,dept.class);
    }
    @RequestMapping("/consumer/dept/add")
    public boolean adddept(@RequestBody dept dept)
    {
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,boolean.class);
    }
    @RequestMapping("/consumer/dept/list")
    public List<dept> list()
    {
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

}
