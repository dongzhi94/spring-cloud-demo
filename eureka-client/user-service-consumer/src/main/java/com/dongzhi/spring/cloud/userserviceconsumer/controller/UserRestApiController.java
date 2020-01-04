package com.dongzhi.spring.cloud.userserviceconsumer.controller;

import com.dongzhi.spring.cloud.user.model.User;
import com.dongzhi.spring.cloud.userserviceconsumer.service.UserServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author ：dongzhi
 * @date ：Created in 2019/12/15 9:36
 * @description：用户服务消费方controller
 * @modified By：
 * @version: 1.0$
 */
@RestController
public class UserRestApiController {

    @Autowired
    private UserServiceProxy userServiceProxy;

    @PostMapping("/user/save")
    public User save(@RequestParam String name){
        User user = new User();
        user.setName(name);
        if(userServiceProxy.save(user)){
            System.out.println(user);
            return user;
        }else{
            return null;
        }
    }

    @GetMapping("/user/list")
    public Collection<User> list(){
        return userServiceProxy.findAll();
    }
}
