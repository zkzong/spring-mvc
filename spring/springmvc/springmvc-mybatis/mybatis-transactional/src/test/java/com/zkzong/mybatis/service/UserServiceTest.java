package com.zkzong.mybatis.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: zkzong
 * @Date: 2018.11.14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring-context.xml"
})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void insertUser() {
        userService.insertUser("zong", 30);
    }
}