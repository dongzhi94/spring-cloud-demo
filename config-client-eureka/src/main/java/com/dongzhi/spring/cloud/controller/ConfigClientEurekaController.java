package com.dongzhi.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：dongzhi
 * @date ：Created in 2020/1/8 20:54
 * @description：controller
 * @modified By：
 * @version: 1.0$
 */
@RestController
@RefreshScope
public class ConfigClientEurekaController {

    @Value("${data.name}")
    private String name;

    @GetMapping("showName")
    public String showName(){
        return name;
    }
}
