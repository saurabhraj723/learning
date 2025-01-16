package com.apachetest.DeliveryPartner.service;

import com.apachetest.DeliveryPartner.constant.AppConstant;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PartnerLocationService {
     private KafkaTemplate<String,Object> kafkaTemplate;

     public boolean updateLocation(String location){
         kafkaTemplate.send(AppConstant.PARTNER_LOCATION,location);
         return true;
     }
}
