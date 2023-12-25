package com.kuang.springcloud.dao;

import com.kuang.springcloud.pojo.dept;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;


@Mapper
public interface Deptdao {
    public boolean addDept(dept dept); //添加一个部门
    public dept queryById(Long id); //根据id查询部门
    public List<dept> queryAll(); //查询所有部门
}
