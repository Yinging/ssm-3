package com.webster.learn.s03shiro;

import com.webster.learn.s02mybatis.entity.User;
import com.webster.learn.s02mybatis.service.UserService;
import com.webster.learn.s03shiro.security.realm.PasswordHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Shiro测试类
 * Created by Webster on 16/3/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class LearnShiroMainTest {

    @Autowired
    PasswordHelper passwordHelper;

    @Autowired
    UserService service;


    @Test
    public void testInsert() throws Exception {
        User user =new User();
        user.setUsername("linda");
        user.setPassword("111111");
        passwordHelper.encryptPassword(user);
        service.insert(user);
    }




}