package com.rkb.api.service.impl;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rkb.api.entity.Order;
import com.rkb.api.model.OutputResponse;
import com.rkb.api.model.Payment;
import com.rkb.api.repository.OrderRepository;
import com.rkb.api.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository repository;

	@Autowired
	RestTemplate templet;

	@Override
	public OutputResponse save(Order order) {
		Order ord = repository.save(order);
		Payment payment = new Payment();
		payment.setOrderId(ord.getOrderId());
		payment.setPaymentId(UUID.randomUUID().toString());
		payment.setStatus(processPayment());
		Payment res = templet.postForObject("http://PAYMENT-SERVICE/payment/pay/", payment, Payment.class);
		OutputResponse out = new OutputResponse();
		out.setOrder(order);
		out.setPayment(res);
		out.setMessage("Order placed successfully");
		out.setStatus("Success");
		return out;
	}

	@Override
	public OutputResponse getOrderDetails(int orderId) {
		Order ord = repository.findByOrderId(orderId);
		OutputResponse res = new OutputResponse();
		res.setOrder(ord);
		res.setMessage("Order fetched successfully");
		res.setStatus("Success");
		return res;
	}

	public String processPayment() {
		String status = new Random().nextBoolean() ? "Success" : "Failure";
		return status;
	}

	public String greetingFromPayement() {
		return templet.getForObject("http://PAYMENT-SERVICE/payment/greeting/", String.class);
	}

}
