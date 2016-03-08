package com.webster.learn.s02mybatis.mapper;

import com.webster.learn.s02mybatis.entity.Car;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 持久层的DAO
 * Created by Webster on 2016/2/22.
 */
@Repository
public interface CarMapper {

         int insert(Car car);

         int update(Car car);

         int delete(Integer id);

         List<Car> selectAll();

         int countAll();

         Car findById(Integer id);

}
