package com.example.clientdemo.feign;

import com.example.clientdemo.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * openFeign接口
 *
 * URL：就是远程端需要调用接口的服务URL路径，name：就是服务名，value和name一样
 * @author qzz
 */
@FeignClient(name = "serviceDemo",url = "http://localhost:8080")
public interface ServiceDemoFeign {

    /**
     * 获取用户列表
     * @return
     */
    @RequestMapping("/api/user/getUserList")
    List<User> getUserList();

}
