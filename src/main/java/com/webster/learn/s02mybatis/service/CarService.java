package com.webster.learn.s02mybatis.service;

import com.webster.learn.s02mybatis.entity.Car;
import com.webster.learn.s02mybatis.entity.Country;
import com.webster.learn.s02mybatis.mapper.CarMapper;
import com.webster.learn.s02mybatis.mapper.CountryMapper;
import org.springframework.stereotype.Service;

/**
 * todo
 * Created by Webster on 16/3/10.
 */
@Service
public class CarService extends BaseService<CarMapper,Car> {
}
