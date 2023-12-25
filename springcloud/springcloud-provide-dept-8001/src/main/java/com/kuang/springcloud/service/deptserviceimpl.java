package com.kuang.springcloud.service;

import com.kuang.springcloud.dao.Deptdao;
import com.kuang.springcloud.pojo.dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class deptserviceimpl implements deptservice{
    @Autowired
    private Deptdao deptdao;

    @Override
    public boolean addDept(dept dept) {
        return deptdao.addDept(dept);
    }

    @Override
    public dept queryById(Long id) {
        return deptdao.queryById(id);
    }

    @Override
    public List<dept> queryAll() {
        return deptdao.queryAll();
    }
}
