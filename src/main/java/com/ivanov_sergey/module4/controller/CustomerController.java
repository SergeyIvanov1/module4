package com.ivanov_sergey.module4.controller;

import com.ivanov_sergey.module4.model.Customer;
import com.ivanov_sergey.module4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/customer")
    public Customer saveCustomer(@RequestBody Customer customer){
        customerService.createCustomer(customer);
        return customer;
    }

    @GetMapping("/customer/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Short id){
        return customerService.getById(id);
    }
}
