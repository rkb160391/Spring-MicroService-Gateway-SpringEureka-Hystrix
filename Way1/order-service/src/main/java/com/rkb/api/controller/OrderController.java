package com.rkb.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rkb.api.entity.Order;
import com.rkb.api.model.OutputResponse;
import com.rkb.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService service;

	@PostMapping("/save")
	public OutputResponse placeOrder(@RequestBody Order req) {
		return service.save(req);
	}

	@GetMapping("/{orderId}")
	public OutputResponse getOrderDetails(@RequestParam int orderId) {
		return service.getOrderDetails(orderId);
	}

	@GetMapping("/greeting")
	public String getGreeting() {
		return service.greetingFromPayement();
	}

	@GetMapping("/returnGreeting")
	public String returnGreeting() {
		return "Hello from OrderService";
	}

}
