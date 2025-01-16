package com.kafkatest.OrderProducer.service;

import com.kafkatest.OrderProducer.Repo.UserRepo;
import com.kafkatest.OrderProducer.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getUsers(){
        List<User> users=userRepo.findAll();
        return users;
    }

    public User createUser(User user){
        userRepo.save(user);
        return user;
    }

}
