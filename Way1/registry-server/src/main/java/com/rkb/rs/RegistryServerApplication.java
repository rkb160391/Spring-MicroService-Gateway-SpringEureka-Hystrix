package com.rkb.rs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistryServerApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(RegistryServerApplication.class);

	@Value("server.port")
	private static String port;
	
	public static void main(String[] args) {

		LOGGER.info("===================================================================");
		LOGGER.info("=                                                                 =");
		LOGGER.info("=         RegistryServer Service starting...                      =");
		LOGGER.info("=                                                                 =");
		LOGGER.info("===================================================================");
		SpringApplication.run(RegistryServerApplication.class, args);
		LOGGER.info("===================================================================");
		LOGGER.info("=                                                                 =");
		LOGGER.info("=     RegistryServer Service started successfully on : "+ port+"  =");
		LOGGER.info("=                                                                 =");
		LOGGER.info("===================================================================");
	}

}
