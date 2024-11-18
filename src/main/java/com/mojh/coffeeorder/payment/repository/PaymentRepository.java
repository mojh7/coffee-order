package com.mojh.coffeeorder.payment.repository;

import com.mojh.coffeeorder.payment.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
