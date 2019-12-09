package com.dongzhi.spring.cloud.user.service;

import com.dongzhi.spring.cloud.user.model.User;

import java.util.Collection;

/**
 * 用户服务
 */
public interface UserService {

    /**
     *
     * @param user
     * @return 如果保存成功的话返回true，否则返回false
     */
    boolean save(User user);

    /**
     * 查询所有用户信息
     * @return 不会返回<code>null</code>
     */
    Collection<User> findAll();
}
