package com.transaction.flightbookingapp.dto;

import com.transaction.flightbookingapp.model.PassengerInfo;
import com.transaction.flightbookingapp.model.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

    private PassengerInfo passengerInfo;

    private PaymentInfo paymentInfo;

//    public FlightBookingRequest(PassengerInfo passengerInfo, PaymentInfo paymentInfo) {
//        this.passengerInfo = passengerInfo;
//        this.paymentInfo = paymentInfo;
//    }

    public PassengerInfo getPassengerInfo() {
        return passengerInfo;
    }

    public void setPassengerInfo(PassengerInfo passengerInfo) {
        this.passengerInfo = passengerInfo;
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    @Override
    public String toString() {
        return "FlightBookingRequest{" +
                "passengerInfo=" + passengerInfo +
                ", paymentInfo=" + paymentInfo +
                '}';
    }

//    public FlightBookingRequest() {
//    }
}
