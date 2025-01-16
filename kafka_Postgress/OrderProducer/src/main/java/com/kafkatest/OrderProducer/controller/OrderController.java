package com.kafkatest.OrderProducer.controller;

import com.kafkatest.OrderProducer.bean.Order;
import com.kafkatest.OrderProducer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("/all")
    public List<Order> getOrders(){
        return orderService.getOrders();
    }

    @PostMapping("/save")
    public Order saveOrder(@RequestBody Order order){
        return orderService.saveOrder(order);
    }


}
