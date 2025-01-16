package com.kafkatest.OrderProducer.Repo;

import com.kafkatest.OrderProducer.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
