package com.kafkatest.OrderProducer.controller;

import com.kafkatest.OrderProducer.bean.User;
import com.kafkatest.OrderProducer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    public List<User> getUsers(){

    }

}
