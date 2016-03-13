package com.webster.learn.s02mybatis.transaction;

import java.util.Map;


/**
 * 收银台,可以一次性支付很多辆车
 */
public interface Cashier {

    void checkout(int userId, Map<Integer,Integer> carIds);
	
}
