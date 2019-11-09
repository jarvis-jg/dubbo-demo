package com.jarvis.dubbo.bootorderserviceconsumer.controller;

import com.jarvis.dubbo.bean.UserAddress;
import com.jarvis.dubbo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * dubbo : com.jarvis.dubbo.bootorderserviceconsumer.controller
 *
 * @author jarvis
 * @create 2019-11-06 20:57
 */
@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping("/initOrder")
    @ResponseBody
    public List<UserAddress> initOrder(@RequestParam("uid") String uid){
        return orderService.initOrder(uid);
    }
}
