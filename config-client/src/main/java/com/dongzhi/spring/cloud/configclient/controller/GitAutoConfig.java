package com.dongzhi.spring.cloud.configclient.controller;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ：dongzhi
 * @date ：Created in 2020/1/6 22:03
 * @description：gitconfig 使用ConfigurationProperties获取配置中心内容
 * @modified By：
 * @version: 1.0$
 */
@Data
@ToString
@Component
@ConfigurationProperties(prefix = "data")
public class GitAutoConfig {

    private String env;

    private String name;

    private String password;

}
