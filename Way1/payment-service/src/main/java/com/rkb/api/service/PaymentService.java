package com.rkb.api.service;

import org.springframework.stereotype.Service;

import com.rkb.api.entity.Payment;
import com.rkb.api.model.OutputResponse;

@Service
public interface PaymentService {

	public OutputResponse savePayment(Payment payment);

	public String greetingFromOrder();

}
