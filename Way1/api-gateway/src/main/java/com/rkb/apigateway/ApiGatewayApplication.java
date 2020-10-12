package com.rkb.apigateway;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class ApiGatewayApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApiGatewayApplication.class);

	public static void main(String[] args) {
		LOGGER.info("===================================================================");
		LOGGER.info("=                                                                 =");
		LOGGER.info("=         API-Gateway Service starting...                          =");
		LOGGER.info("=                                                                 =");
		LOGGER.info("===================================================================");
		LOGGER.info("=                                                                 =");
		SpringApplication.run(ApiGatewayApplication.class, args);
		LOGGER.info("===================================================================");
		LOGGER.info("=                                                                 =");
		LOGGER.info("=         API-Gateway Service started successfully                =");
		LOGGER.info("=                                                                 =");
		LOGGER.info("===================================================================");
	}

}
