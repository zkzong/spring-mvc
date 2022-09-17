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
public class PersonServiceTest {

    @Autowired
    private PersonService personService;

    @Test
    public void insertPerson() {
        personService.insertPerson("zong", 30);
    }
}