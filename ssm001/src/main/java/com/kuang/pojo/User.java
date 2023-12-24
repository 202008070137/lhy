package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component  // 相当于配置文件中 <bean id="user" class="当前注解的类"/>
public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public User(String name) {
        this.name = name;
    }

    public User() {
    }
}
