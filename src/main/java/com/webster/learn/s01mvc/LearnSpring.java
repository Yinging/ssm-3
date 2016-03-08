package com.webster.learn.s01mvc;

import com.webster.learn.s01mvc.entity.LearnMan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * s01 spring的第一课，基础步骤
 * Author: Webster
 * Create: 2016-02-20 下午4:38
 */
public class LearnSpring {
    public static void main(String[] args){

        //1.创建ioc容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


        //2.从容器中获取Bean
        LearnMan learnMan =  context.getBean(LearnMan.class);

        //3.调用方法
        learnMan.setUserName("张三");

        System.out.println(learnMan.sayHello());
        System.out.println(learnMan.sayHelloToUser());


    }
}