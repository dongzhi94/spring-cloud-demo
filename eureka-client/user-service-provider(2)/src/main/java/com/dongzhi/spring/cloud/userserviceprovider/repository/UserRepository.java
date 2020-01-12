package com.dongzhi.spring.cloud.userserviceprovider.repository;

import com.dongzhi.spring.cloud.user.model.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author ：dongzhi
 * @date ：Created in 2019/12/9 22:00
 * @description：用户仓库
 * @modified By：
 * @version: 1.0$
 */
@Repository
public class UserRepository {
    /**
     * 保存在本地
     */
    private ConcurrentMap<Long,User> repository = new ConcurrentHashMap<>();

    /**
     * 自增长id，从0开始
     */
    private static final AtomicLong idGenerator = new AtomicLong(0);

    public Collection<User> findAll(){
        return repository.values();
    }

    public boolean save(User user){
        Long id = idGenerator.incrementAndGet();
        user.setId(id);
        //TODO
        return repository.putIfAbsent(id,user) == null;
    }
}
