package com.webster.learn.s02mybatis.service;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * service基类
 * Created by chenkaihua on 15-12-23.
 */
public interface BaseService<Mapp extends Mapper<M>,M>{

     int deleteByExample(Object example);


     int deleteByPrimaryKey(Object key);


     int delete(M record) ;


     int insert(M record) ;


     int insertSelective(M record);


     List<M> selectAll() ;


     List<M> selectByExample(Object example) ;


     List<M> selectByExampleAndRowBounds(Object example, RowBounds rowBounds) ;


     M selectByPrimaryKey(Object key) ;


     int selectCountByExample(Object example) ;


     int selectCount(M record) ;


     List<M> select(M record) ;


     M selectOne(M record);


     List<M> selectByRowBounds(M record, RowBounds rowBounds) ;


     int updateByExample(@Param("record") M record, @Param("example") Object example) ;


     int updateByExampleSelective(@Param("record") M record, @Param("example") Object example) ;


     int updateByPrimaryKey(M record) ;

     int updateByPrimaryKeySelective(M record);
}