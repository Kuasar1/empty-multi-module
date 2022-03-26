package com.ecommerce.customerservice.controller;

import com.ecommerce.customerservice.entity.Customer;
import com.ecommerce.customerservice.service.CustomerService;
import com.ecommerce.customerservice.service.OnboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;
    private final OnboardService onboardService;

    @GetMapping("/customer/{id}")
    public ResponseEntity<?> findCustomerById(@PathVariable(value = "id") Integer id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping("/customer/full")
    public ResponseEntity<String> fullOnboard(@RequestBody Customer customer) {
        return onboardService.fullOnboard(customer);
    }

    @PostMapping("/customer/tempo")
    public ResponseEntity<String> tempoOnboard(@RequestBody Customer customer) {
        return onboardService.tempoOnboard(customer);
    }

    @GetMapping("/")
    public String home() {
        return "HI";
    }

    @GetMapping("/error")
    public String error() {
        return "ERROR OCCURRED";
    }

}
