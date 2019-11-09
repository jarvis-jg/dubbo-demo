package com.jarvis.dubbo.service.impl;

import com.jarvis.dubbo.bean.UserAddress;
import com.jarvis.dubbo.service.OrderService;
import com.jarvis.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * dubbo : com.jarvis.dubbo.service.impl
 *
 * @author jarvis
 * @create 2019-11-03 16:59
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;


    @Override
    public List<UserAddress> initOrder(String userId) {
        // TODO Auto-generated method stub
        System.out.println("用户id："+userId);
        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }
        return addressList;
    }

}
