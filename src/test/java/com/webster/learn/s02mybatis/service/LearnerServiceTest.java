package com.webster.learn.s02mybatis.service;

import com.webster.learn.s02mybatis.entity.Learner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * 测试ehcache
 * Create by Webster in 2016-03-01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class LearnerServiceTest {
    @Autowired
    LearnerService service;

    @Autowired
    Learner learner;


    @Test
    public void testInsert() throws Exception {
        learner.setName("linda");
        service.insert(learner);
    }

    @Test
    public void testUpdate() throws Exception {
        learner.setId(2);
        learner.setAge(39);
        service.update(learner);
    }

    @Test
    public void testDelete() throws Exception {
        service.delete(3);
    }

    @Test
    public void testSelectAll() throws Exception {
        List<Learner> learners = service.selectAll();
        System.out.println("      @@@========>" + learners.toString());

    }

    @Test
    public void testCountAll() throws Exception {
        System.out.println("      @@@========>" + service.countAll());

    }

    @Test
    public void testFindById() throws Exception {
        learner = service.findById(1);
        System.out.println("      @@@========>" + learner.toString());
    }

    @Test
    public void testFindByName() throws Exception {
        learner = service.findByName("zhaoliu");
        System.out.println("      @@@========>" + learner.toString());
    }
}