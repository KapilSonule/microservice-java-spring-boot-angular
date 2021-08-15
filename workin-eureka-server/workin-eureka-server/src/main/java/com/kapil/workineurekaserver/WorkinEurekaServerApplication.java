package com.kapil.workineurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WorkinEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkinEurekaServerApplication.class, args);
	}

}
