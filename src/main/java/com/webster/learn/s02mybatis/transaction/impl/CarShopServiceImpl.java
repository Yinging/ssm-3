package com.webster.learn.s02mybatis.transaction.impl;

import com.webster.learn.s02mybatis.entity.Car;
import com.webster.learn.s02mybatis.entity.User;
import com.webster.learn.s02mybatis.service.CarService;
import com.webster.learn.s02mybatis.service.UserService;
import com.webster.learn.s02mybatis.transaction.CarShopService;
import com.webster.learn.s02mybatis.transaction.exception.CarStockException;
import com.webster.learn.s02mybatis.transaction.exception.UserAccountException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("carShopService")
public class CarShopServiceImpl implements CarShopService {


    @Autowired
    private CarService carService;

    @Autowired
    private UserService userService;

    public static Logger log = LoggerFactory.getLogger(CarShopServiceImpl.class);


    @Transactional
    @Override
    public void purchase(Integer userId, Integer carId,Integer num) {

        Long price =  carService.selectByPrimaryKey(carId).getPrice();
        updateCarStock(carId,num);
        updateUserAccount(userId,price*num);

    }


    public void updateCarStock(int id,int num) {

        Car car = carService.selectByPrimaryKey(id);
        int stock = car.getStock();
        if(stock<num){
            throw new CarStockException("没有足够的库存车,还剩["+stock+"]辆");
        }
        car.setStock(car.getStock()-num);
        carService.updateByPrimaryKey(car);
        log.debug("购买车 {},{}辆, 单价{} 剩余库存 {}",car.getBland(),num,car.getPrice(),car.getStock());

    }

    public void updateUserAccount(int id, Long price) {

        User user = userService.selectByPrimaryKey(id);
        Long deposit = user.getDeposit();
        if(deposit<price){
            throw new UserAccountException("帐号存款不足");

        }
        user.setDeposit(deposit-price);
        userService.updateByPrimaryKey(user);
        log.debug("用户 {} , 花费 {}, 余额 {}",user.getUsername(),price,user.getDeposit());


    }


}
