package com.transaction.flightbookingapp.dto;

import com.transaction.flightbookingapp.model.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingAcknowledgement {
    private String status;
    private double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;

//    public FlightBookingAcknowledgement(String status, double totalFare, String pnrNo, PassengerInfo passengerInfo) {
//        this.status = status;
//        this.totalFare = totalFare;
//        this.pnrNo = pnrNo;
//        this.passengerInfo = passengerInfo;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public String getPnrNo() {
        return pnrNo;
    }

    public void setPnrNo(String pnrNo) {
        this.pnrNo = pnrNo;
    }

    public PassengerInfo getPassengerInfo() {
        return passengerInfo;
    }

    public void setPassengerInfo(PassengerInfo passengerInfo) {
        this.passengerInfo = passengerInfo;
    }

    @Override
    public String toString() {
        return "FlightBookingAcknowledgement{" +
                "status='" + status + '\'' +
                ", totalFare=" + totalFare +
                ", pnrNo='" + pnrNo + '\'' +
                ", passengerInfo=" + passengerInfo +
                '}';
    }

//    public FlightBookingAcknowledgement() {
//    }
}
