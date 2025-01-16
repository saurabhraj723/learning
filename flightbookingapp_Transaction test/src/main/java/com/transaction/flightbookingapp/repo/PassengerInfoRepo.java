package com.transaction.flightbookingapp.repo;

import com.transaction.flightbookingapp.model.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerInfoRepo extends JpaRepository<PassengerInfo,Long> {
}
