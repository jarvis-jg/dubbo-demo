package com.jarvis.dubbo.service.impl;

import com.jarvis.dubbo.bean.UserAddress;
import com.jarvis.dubbo.service.UserService;

import java.util.List;

/**
 * dubbo : com.jarvis.dubbo.service.impl
 *
 * @author jarvis
 * @create 2019-11-06 21:34
 */
public class UserServiceStub implements UserService {

    private UserService userService;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // 可以做一些校验
        System.out.println("UserServiceStub" + userId);
        return userService.getUserAddressList(userId);
    }
}
