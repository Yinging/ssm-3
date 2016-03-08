package com.webster.learn.s02mybatis.mapper;

import com.webster.learn.s02mybatis.entity.Learner;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层的DAO
 * Created by Webster on 2016/2/22.
 */
@Repository
public interface LearnerMapper {

    int insert(Learner learner);

    int update(Learner learner);

    int delete(Integer id);

    List<Learner> selectAll();

    int countAll();

    Learner findById(Integer id);

    Learner findByName(String name);


}
