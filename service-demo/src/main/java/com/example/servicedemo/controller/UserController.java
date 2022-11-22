package com.example.servicedemo.controller;

import com.example.servicedemo.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qzz
 */
@RestController
public class UserController {

    @RequestMapping("/api/user/getUserList")
    public List<User> getUserList(){
        //模拟数据库请求数据
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setId(1);
        user.setName("Jack");
        user.setAge(31);
        list.add(user);
        return list;
    }
}
