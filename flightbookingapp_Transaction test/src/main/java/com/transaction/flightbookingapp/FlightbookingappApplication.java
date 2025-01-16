package com.transaction.flightbookingapp;

import com.transaction.flightbookingapp.dto.FlightBookingAcknowledgement;
import com.transaction.flightbookingapp.dto.FlightBookingRequest;
import com.transaction.flightbookingapp.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FlightbookingappApplication {
	@Autowired
	FlightBookingService flightBookingService;
	@PostMapping("/bookflightticket")
	public FlightBookingAcknowledgement bookingAcknowledgement(@RequestBody FlightBookingRequest request){
		return flightBookingService.bookFlightTicket(request);
	}
	public static void main(String[] args) {
		SpringApplication.run(FlightbookingappApplication.class, args);
	}

}
