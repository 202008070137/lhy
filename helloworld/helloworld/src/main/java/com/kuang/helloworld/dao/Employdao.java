package com.kuang.helloworld.dao;

import com.kuang.helloworld.pojo.Department;
import com.kuang.helloworld.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Repository
public class Employdao {

    private static Map<Integer, Employee> Employees = null;
    @Autowired
    private Depementdao depementdao;
    static {
        Employees = new HashMap<Integer, Employee>();
        Employees.put(1,new Employee(1,"zs1","kk@qq.com",0,new Department(101,"教学部1")));
        Employees.put(2,new Employee(2,"zs2","kk@qq.com",0,new Department(102,"教学部2")));
        Employees.put(3,new Employee(3,"zs3","kk@qq.com",0,new Department(103,"教学部3")));
        Employees.put(4,new Employee(4,"zs4","kk@qq.com",0,new Department(104,"教学部4")));
        Employees.put(5,new Employee(5,"zs5","kk@qq.com",0,new Department(105,"教学部5")));


    }
    //自增
    private  static  Integer initid = 6;
    //add
    public void addemploy(Employee Employee)
    {
       if(Employee.getId()==null)
       {
           Employee.setId(initid++);
       }
       Employee.setDepartment(depementdao.getDepartmentnyid(Employee.getDepartment().getId()));

       Employees.put(Employee.getId(),Employee);
    }

    //findall
    public Collection<Employee> findall()
    {
        return Employees.values();
    }
    //byid
    public Employee findbyid(Integer id)
    {
        return  Employees.get(id);
    }
    //del
    public void delete(Integer id)
    {
        Employees.remove(id);
    }

}
