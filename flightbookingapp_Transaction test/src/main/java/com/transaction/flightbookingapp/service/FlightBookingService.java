package com.transaction.flightbookingapp.service;

import com.transaction.flightbookingapp.dto.FlightBookingAcknowledgement;
import com.transaction.flightbookingapp.dto.FlightBookingRequest;
import com.transaction.flightbookingapp.model.PassengerInfo;
import com.transaction.flightbookingapp.model.PaymentInfo;
import com.transaction.flightbookingapp.repo.PassengerInfoRepo;
import com.transaction.flightbookingapp.repo.PaymentInfoRepo;
import com.transaction.flightbookingapp.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FlightBookingService {
    @Autowired
    private PassengerInfoRepo passengerInfoRepo;
    @Autowired
    private PaymentInfoRepo paymentInfoRepo;
    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request){
//        FlightBookingAcknowledgement flightBookingAcknowledgement=null;
        PassengerInfo passengerInfo=request.getPassengerInfo();
       passengerInfoRepo.save(passengerInfo);
        PaymentInfo paymentInfo=request.getPaymentInfo();
        PaymentUtils.validCredentials(paymentInfo.getAccountNo(),passengerInfo.getFare());
        paymentInfo.setPassengerId(passengerInfo.getId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepo.save(paymentInfo);
        return new FlightBookingAcknowledgement("Success",passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0],passengerInfo);


    }
}
