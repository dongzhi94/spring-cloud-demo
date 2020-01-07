package com.dongzhi.spring.cloud.configclient.controller;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ：dongzhi
 * @date ：Created in 2020/1/6 22:01
 * @description：gitConfig使用@value注解获取配置中心内容
 * @modified By：
 * @version: 1.0$
 */
@Data
@ToString
@Component
public class GitConfig {

    @Value("${data.env}")
    private String env;

    @Value("${data.name}")
    private String name;

    @Value("${data.password}")
    private String password;

}
