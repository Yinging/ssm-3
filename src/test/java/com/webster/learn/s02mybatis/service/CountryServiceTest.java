package com.webster.learn.s02mybatis.service;

import com.webster.learn.s02mybatis.entity.Car;
import com.webster.learn.s02mybatis.entity.Country;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * 测试mybatis
 * Create by Webster in 2016-03-01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class CountryServiceTest {

    @Autowired
    CountryService service;

    @Autowired
    Country country;

    public static Logger log = LoggerFactory.getLogger(CountryService.class);


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testInsert() throws Exception {
        country.setCountryname("女儿国");
       service.insert(country);
    }

    @Test
    public void testUpdate() throws Exception {

    }

    @Test
    public void testDelete() throws Exception {

    }

    @Test
    public void testSelectAll() throws Exception {

    }

    @Test
    public void testCountAll() throws Exception {

    }

    @Test
    public void testFindById() throws Exception {
    }
}