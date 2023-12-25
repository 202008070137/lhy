package com.kuang.springcloud.service;
import com.kuang.springcloud.pojo.dept;
import java.util.List;

public interface deptservice {
    public boolean addDept(dept dept); //添加一个部门
    public dept queryById(Long id); //根据id查询部门
    public List<dept> queryAll(); //查询所有部门
}
