package com.webster.learn.s01mvc;

/**
 * todo
 * Created by Webster on 16/3/10.
 */
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class BaseTest {
    public static Logger log = LoggerFactory.getLogger(BaseTest.class);

}

