package com.webster.learn.s02mybatis.service;

import com.github.pagehelper.PageHelper;
import com.webster.learn.s01mvc.BaseTest;
import com.webster.learn.s02mybatis.entity.Car;
import com.webster.learn.s02mybatis.service.impl.CarServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


/**
 * ToDo...
 * Created by Vince on 2016/3/11.
 */


public class CarServiceTest extends BaseTest{

    @Autowired
    CarServiceImpl service;

    @Test
    public void testInsert(){
        Car car = new Car();
        car.setPrice(10l);
        car.setBland("现代");
        car.setColor("红色");
        service.insert(car);

    }

    @Test
    public void testSelect() {

        Example example = new Example(Car.class);
        example.createCriteria()
                .andGreaterThan("id", 0);
        example.setOrderByClause("price");
        //获取第1页，10条内容，默认查询总数count
        PageHelper.startPage(1, 2);
        //紧跟着的第一个select方法会被分页
        List<Car> cars = service.selectByExample(example);
        log.debug("==============================================");
        log.debug(cars.toString());





    }


}