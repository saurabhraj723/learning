package com.kafkatest.OrderProducer.Repo;

import com.kafkatest.OrderProducer.bean.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Integer> {
}
