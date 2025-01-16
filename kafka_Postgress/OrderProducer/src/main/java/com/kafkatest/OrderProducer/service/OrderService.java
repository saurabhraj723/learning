package com.kafkatest.OrderProducer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafkatest.OrderProducer.Repo.OrderRepo;
import com.kafkatest.OrderProducer.bean.Order;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;
    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;
    @Value("${spring.kafka.topic.name}")
    private String topicName;

    ObjectMapper om=new ObjectMapper();

    public Order saveOrder(Order order){
        order.setStatus("Created");
        orderRepo.save(order);
        try{
            String orderStr=om.writeValueAsString(order);
            kafkaTemplate.send(topicName,orderStr);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return order;

    }

    public List<Order> getOrders(){

        List<Order> orders=orderRepo.findAll();
        return orders;

    }

}
