package com.rkb.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableJpaRepositories
public class PaymentServiceApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(PaymentServiceApplication.class);

	public static void main(String[] args) {

		LOGGER.info("===================================================================");
		LOGGER.info("=                                                                 =");
		LOGGER.info("=         Payment Service starting...                             =");
		LOGGER.info("=                                                                 =");
		LOGGER.info("===================================================================");
		LOGGER.info("=                                                                 =");
		SpringApplication.run(PaymentServiceApplication.class, args);
		LOGGER.info("===================================================================");
		LOGGER.info("=                                                                 =");
		LOGGER.info("=         Payment Service started successfully                    =");
		LOGGER.info("=                                                                 =");
		LOGGER.info("===================================================================");
	}

	@Bean
	@LoadBalanced
	public RestTemplate getTemplet() {
		return new RestTemplate();
	}

}
