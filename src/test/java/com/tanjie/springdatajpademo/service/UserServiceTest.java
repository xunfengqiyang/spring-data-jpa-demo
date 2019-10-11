package com.tanjie.springdatajpademo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Info
 *
 * @author: Jie.Tan
 * @verison: v1.0
 * @time: Created in 2019/10/11 9:45 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void addUser() {
        userService.addUser();
    }
}