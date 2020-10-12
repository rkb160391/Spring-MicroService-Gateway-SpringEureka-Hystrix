package com.rkb.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rkb.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
