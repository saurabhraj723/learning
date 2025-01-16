package com.transaction.flightbookingapp.repo;

import com.transaction.flightbookingapp.model.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentInfoRepo extends JpaRepository<PaymentInfo,String> {
}
