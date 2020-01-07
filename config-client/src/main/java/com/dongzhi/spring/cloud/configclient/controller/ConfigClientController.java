package com.dongzhi.spring.cloud.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：dongzhi
 * @date ：Created in 2020/1/6 21:58
 * @description：controller展示读取配置内容
 * @modified By：
 * @version: 1.0$
 */
@RestController
@RefreshScope
public class ConfigClientController {

    @Autowired
    private GitConfig gitConfig;

    @Autowired
    private GitAutoConfig gitAutoConfig;

    @GetMapping("show")
    public Object show(){
        return gitConfig;
    }

    @GetMapping("autoShow")
    public Object autoShow(){
        return gitAutoConfig;
    }
}
