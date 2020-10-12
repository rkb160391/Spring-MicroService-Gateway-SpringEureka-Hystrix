package com.rkb.hd;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(HystrixDashboardApplication.class);

	public static void main(String[] args) {
		LOGGER.info("===================================================================");
		LOGGER.info("=                                                                 =");
		LOGGER.info("=         Hystrix-Dashboard Service starting...                   =");
		LOGGER.info("=                                                                 =");
		LOGGER.info("===================================================================");
		LOGGER.info("=                                                                 =");
		SpringApplication.run(HystrixDashboardApplication.class, args);
		LOGGER.info("===================================================================");
		LOGGER.info("=                                                                 =");
		LOGGER.info("=         Hystrix-Dashboard Service started successfully          =");
		LOGGER.info("=                                                                 =");
		LOGGER.info("===================================================================");
	}

}
