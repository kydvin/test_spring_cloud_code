package com.kkk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroserviceDiscoveryEurakaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceDiscoveryEurakaApplication.class, args);
	}
}
