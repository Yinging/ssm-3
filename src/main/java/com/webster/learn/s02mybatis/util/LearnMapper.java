package com.webster.learn.s02mybatis.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用的Mapper
 *
 * Created by Webster on 16/3/10.
 */
//public interface LearnMapper<T>  extends Mapper<T>, MySqlMapper<T> {
public interface LearnMapper<T>  extends Mapper<T> {
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
