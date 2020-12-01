package com.service;

import com.dao.UserDao;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> queryUserList(){
        return  this.userDao.queryUserList();
    }
}
