package com.webster.learn.s02mybatis.service;

import com.webster.learn.s01mvc.BaseTest;
import com.webster.learn.s02mybatis.entity.Car;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * ToDo...
 * Created by Vince on 2016/3/11.
 */


public class CarServiceTest extends BaseTest{

    @Autowired
    CarService service;

    @Test
    public void testInsert(){
        Car car = new Car();
        car.setPrice(10l);
        car.setBland("现代");
        car.setColor("红色");
        service.insert(car);

    }

}