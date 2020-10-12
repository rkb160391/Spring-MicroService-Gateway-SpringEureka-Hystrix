package com.rkb.api.service;

import org.springframework.stereotype.Service;

import com.rkb.api.entity.Order;
import com.rkb.api.model.OutputResponse;

@Service
public interface OrderService {

	public OutputResponse save(Order order);

	public OutputResponse getOrderDetails(int orderId);

	public String greetingFromPayement();

}
