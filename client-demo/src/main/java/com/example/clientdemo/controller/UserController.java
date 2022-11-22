package com.example.clientdemo.controller;

import com.example.clientdemo.entity.User;
import com.example.clientdemo.feign.ServiceDemoFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author qzz
 */
@RestController
public class UserController {

    /**
     * 注入OpenFeign接口
     */
    @Autowired
    private ServiceDemoFeign serviceDemoFeign;

    @RequestMapping("/api/client/user/getUserList")
    public List<User> getUserList(){
        return serviceDemoFeign.getUserList();
    }

}
