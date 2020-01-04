package com.dongzhi.spring.cloud.userserviceprovider.controller;

import com.dongzhi.spring.cloud.user.model.User;
import com.dongzhi.spring.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author ：dongzhi
 * @date ：Created in 2019/12/15 9:17
 * @description：用户服务提供方controller
 * @modified By：
 * @version: 1.0$
 */
@RestController
public class UserProviderRestApiController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/save")
    public User saveUser(@RequestBody User user){
        if(userService.save(user)){
            return user;
        }else{
            return null;
        }
    }

    @GetMapping("/user/list")
    public Collection<User> list(){
        return userService.findAll();
    }
}
