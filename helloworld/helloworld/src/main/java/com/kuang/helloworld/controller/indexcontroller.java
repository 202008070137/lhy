package com.kuang.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

//在templates目录下面的页面，只能通过controller来跳转
//需要模板引擎
@Controller    //返回视图
public class indexcontroller {
//    @RequestMapping("/text")
//    public String index(Model model)
//    {
//        model.addAttribute("msg","hello world");
//        model.addAttribute("users", Arrays.asList("lhy","ttl","asdasd","ttx"));
//        return "text";
//    }
}
