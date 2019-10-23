package com.dz.controller;

import com.dz.pojo.User;
import com.dz.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("save")
    public String save(){

        User user = new User();
        user.setPassword("234567");
        user.setUsername("Hanks");
        userService.save(user);
        return "user/success";
    }

    @RequestMapping("findPage")
    @ResponseBody
    public PageInfo<User> findPage(){
        PageHelper.startPage(1,4);
        List<User> users = userService.findPage();
        PageInfo<User> pageInfo = new PageInfo<User>(users);
        return pageInfo;
    }


}
