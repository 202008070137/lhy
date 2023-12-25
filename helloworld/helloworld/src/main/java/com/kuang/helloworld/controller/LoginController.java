package com.kuang.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model Model, HttpSession session)
     {
       if(!StringUtils.isEmpty(username) && "123".equals(password))
       {
           session.setAttribute("logsess",username);
           return "redirect:/main.html";
       }
       else
       {
           Model.addAttribute("msg","登录失败");
           return "index";
       }
     }

}
