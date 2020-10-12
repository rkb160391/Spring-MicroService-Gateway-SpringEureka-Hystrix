package com.rkb.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rkb.api.entity.Payment;
import com.rkb.api.model.OutputResponse;
import com.rkb.api.repository.PaymentRepository;
import com.rkb.api.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentRepository repo;
	
	@Autowired
	RestTemplate templet;

	@Override
	public OutputResponse savePayment(Payment payment) {
		Payment pay = repo.save(payment);
		OutputResponse res = new OutputResponse();
		res.setData(pay);
		res.setStatus("Success");
		res.setMessage("Payment successfull");
		return res;
	}

	@Override
	public String greetingFromOrder() {
		return templet.getForObject("http://ORDER-SERVICE/order/greeting/", String.class);
	}

}
