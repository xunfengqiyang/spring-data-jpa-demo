package com.tanjie.springdatajpademo.service;

import com.tanjie.springdatajpademo.entity.User;
import com.tanjie.springdatajpademo.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Info
 *
 * @author: Jie.Tan
 * @verison: v1.0
 * @time: Created in 2019/10/11 9:31 PM
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public void addUser() {
        User user=new User();
        user.setUserName("zhangsan1");
        user.setPassword("12345");
        userDao.save(user);
    }

}
