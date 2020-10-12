package com.rkb.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

	@GetMapping("/orderFallback")
	public Mono<String> oderFallback() {
		return Mono.just("Order service is taking to long to respond or down, Please try again later");
	}

	@GetMapping("/paymentFallback")
	public Mono<String> paymentFallback() {
		return Mono.just("Payment service is taking to long to respond or down, Please try again later");
	}

}
