package com.webster.learn.s03shiro;

import com.webster.learn.s02mybatis.entity.Learner;
import com.webster.learn.s02mybatis.service.LearnerService;
import com.webster.learn.s03shiro.security.PasswordHelper;
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
    LearnerService learnerService;

    @Autowired
    Learner learner;

    @Test
    public void testInsert() throws Exception {
        learner.setName("linda");
        learner.setPassword("111111");
        passwordHelper.encryptPassword(learner);
        learnerService.insert(learner);
    }




}