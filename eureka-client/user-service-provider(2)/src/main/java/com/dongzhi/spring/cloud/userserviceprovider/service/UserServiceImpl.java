package com.dongzhi.spring.cloud.userserviceprovider.service;

import com.dongzhi.spring.cloud.user.model.User;
import com.dongzhi.spring.cloud.user.service.UserService;
import com.dongzhi.spring.cloud.userserviceprovider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @author ：dongzhi
 * @date ：Created in 2019/12/15 9:12
 * @description：用户service实现类
 * @modified By：
 * @version: 1.0$
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Collection<User> findAll() {
        return userRepository.findAll();
    }
}
