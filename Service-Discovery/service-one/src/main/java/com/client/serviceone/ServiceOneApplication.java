package com.client.serviceone;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceOneApplication {

    @Value("${instance.name}")
    private String instanceName;

    public static void main(String[] args) {
        SpringApplication.run(ServiceOneApplication.class, args);
    }

    @GetMapping("/")
    public String greet() {
        return "Hello from "+instanceName;
    }
}
