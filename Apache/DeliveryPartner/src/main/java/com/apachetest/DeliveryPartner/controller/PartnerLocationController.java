package com.apachetest.DeliveryPartner.controller;

import com.apachetest.DeliveryPartner.service.PartnerLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("location")
public class PartnerLocationController {
    @Autowired
    private PartnerLocationService partnerLocationService;
    @GetMapping
    public void hello(){
        System.out.println("hello");
    }
    @PutMapping
    public ResponseEntity updateLocation() throws InterruptedException {
        int range=100;
        while(range>0){
           partnerLocationService.updateLocation(Math.random()+","+Math.random());
           Thread.sleep(1000);
            range--;
        }

        return new ResponseEntity<>(Map.of("message","Location updated"), HttpStatus.OK);
    }

}
