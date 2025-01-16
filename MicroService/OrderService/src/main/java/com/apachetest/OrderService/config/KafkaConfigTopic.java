package com.apachetest.OrderService.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfigTopic {
    @Value("${spring.kafka.topic.name}")
    private String topicName;

    //spring bean for topic
    @Bean
    public NewTopic topic(){
//        return TopicBuilder.name(topicName).partitions(2).
//                build();

        return new NewTopic(topicName, 2, (short) 1); // alternative way of the upper one   (topic name,numPartition,replicationfactor)
    }

}
