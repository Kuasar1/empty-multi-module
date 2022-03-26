package com.ecommerce.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ecommerce.*"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}