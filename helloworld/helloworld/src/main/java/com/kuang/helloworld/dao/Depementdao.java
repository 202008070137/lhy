package com.kuang.helloworld.dao;

import com.kuang.helloworld.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//部门dao
@Repository  //用于标识一个类是数据访问层（DAO）的组件
public class Depementdao {
    //模拟数据
    private static Map<Integer, Department> departments = null;
    static {
        departments = new HashMap<Integer, Department>();  //创建一个表
        departments.put(101,new Department(101,"教学部1"));
        departments.put(102,new Department(102,"教学部2"));
        departments.put(103,new Department(103,"教学部3"));
        departments.put(104,new Department(104,"教学部4"));
        departments.put(105,new Department(105,"教学部5"));
        departments.put(106,new Department(106,"教学部6"));
    }

    //获得所有信息
    public Collection<Department> GetDepartment()
    {
          return  departments.values();
    }

    public  Department  getDepartmentnyid(Integer id)
    {
        return departments.get(id);
    }

    public void deldeparment(Integer id)
    {
         departments.remove(id);
    }

    public void adddepment(Integer id,Department department)
    {
        departments.put(id,department);
    }
}
