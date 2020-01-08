package com.dongzhi.spring.cloud.userserviceconsumer.service;

import com.dongzhi.spring.cloud.user.model.User;
import com.dongzhi.spring.cloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author ：dongzhi
 * @date ：Created in 2019/12/15 11:29
 * @description：用户服务请求代理-远程请求道eureka客户端
 * @modified By：
 * @version: 1.0$
 */
@Service
public class UserServiceProxy implements UserService {

    /**
     * 服务名
     */
    private static final String PROVIDER_SERVER_URL_PREFIX="http://user-service-provider/";
    /**
     * 以前service是本地服务，现在通过REST API代理到服务器提供者
     */
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public boolean save(User user) {
        String userName = user.getName();
        //要写具体的服务路径
        User returnUser = restTemplate.postForObject(PROVIDER_SERVER_URL_PREFIX+"user/save/",user,User.class);
        if(returnUser == null){
            return false;
        }else{
            user.setId(returnUser.getId());
            return true;
        }
//        return returnUser != null;
    }

    @Override
    public Collection<User> findAll() {
        return restTemplate.getForObject(PROVIDER_SERVER_URL_PREFIX+"/user/list/",Collection.class);
    }
}
