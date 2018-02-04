package com.microservice.archetype.block.servicediscovereurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscoverEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoverEurekaServerApplication.class, args);
	}
}
