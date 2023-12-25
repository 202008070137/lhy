package com.kuang.helloworld.service;

import com.kuang.helloworld.dao.UserDao;
import com.kuang.helloworld.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDaoImpl();

    @Override
    public void getuser() {
        userDao.getuser();
    }
}
