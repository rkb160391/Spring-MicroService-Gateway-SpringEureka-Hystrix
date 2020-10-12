package com.rkb.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rkb.api.entity.Payment;
import com.rkb.api.model.OutputResponse;
import com.rkb.api.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	PaymentService service;

	@PostMapping("/pay")
	public OutputResponse savePayment(Payment payment) {
		return service.savePayment(payment);
	}

	@GetMapping("/greeting")
	public String greeting() {
		return "Hello from Payment";
	}

	@GetMapping("/getGreetingFromOrder")
	public String greetingFromOrder() {
		return service.greetingFromOrder();
	}

}
