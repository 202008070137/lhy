package com.kuang.helloworld.controller;

import com.kuang.helloworld.dao.Employdao;
import com.kuang.helloworld.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class empcontroller {
    @Autowired
    Employdao employdao;

    @RequestMapping("/emps")
    public String emp(Model model)
    {
        Collection<Employee> listemp = employdao.findall();
        model.addAttribute("emps",listemp);
        return "/emp/list";
    }
}
