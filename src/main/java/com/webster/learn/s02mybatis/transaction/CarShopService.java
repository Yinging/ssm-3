package com.webster.learn.s02mybatis.transaction;


/**
 * 车商店,一次买一部车
 */
public interface CarShopService {
	
	public void purchase(Integer userId, Integer carId,Integer num);
	
}
