package com.webster.learn.s02mybatis.service.impl;

import com.webster.learn.s02mybatis.entity.Car;
import com.webster.learn.s02mybatis.mapper.CarMapper;
import com.webster.learn.s02mybatis.service.CarService;
import org.springframework.stereotype.Service;

/**
 * todo
 * Created by Webster on 16/3/10.
 */
@Service("carService")
public class CarServiceImpl  extends BaseServiceImpl<CarMapper,Car> implements CarService{
}
