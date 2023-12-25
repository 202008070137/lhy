package com.kuang.helloworld.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//拦截器
public class Logininterpert implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //登录成功，由用户的session
       Object ob =  request.getSession().getAttribute("logsess");

       if (ob==null)
       {
           request.setAttribute("error","error");
           request.getRequestDispatcher("/index.html").forward(request,response);
           return false;
       }
       else {
           return true;
       }
    }
}
