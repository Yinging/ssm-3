package com.webster.learn.s02mybatis.service;


import com.webster.learn.s02mybatis.entity.Car;

import java.util.List;

/**
 * 业务层 接口
 * Created by Webster on 2016/2/22.
 */
public interface CarService {
    int insert(Car car);

    int update(Car car);

    int delete(Integer id);

    List<Car> selectAll();

    int countAll();

    Car findById(Integer id);
}
