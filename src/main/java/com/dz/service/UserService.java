package com.dz.service;

import com.dz.dao.UserDao;
import com.dz.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    public void save(User user) {
        userDao.save(user);
    }


    public List<User> findPage() {
        return userDao.findPage();
    }
}
