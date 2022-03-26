package com.ecommerce.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.ecommerce.customerservice"})
@EnableJpaRepositories(basePackages = {"com.ecommerce.customerservice"})
@EntityScan(basePackages = {"com.ecommerce.customerservice"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}