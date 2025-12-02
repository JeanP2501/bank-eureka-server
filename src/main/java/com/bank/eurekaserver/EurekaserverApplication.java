package com.bank.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server Application.
 * Service Discovery and Registration for all microservices
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplication {

    /**
     * Main method to start Eureka Server.
     * @param args command line arguments
     */
	public static void main(String[] args) {
		SpringApplication.run(EurekaserverApplication.class, args);
	}

}
