package com.ivanov_sergey.module4.service;

import com.ivanov_sergey.module4.model.Customer;

import java.util.Optional;

public interface CustomerService {
    public Customer createCustomer(Customer customer);

    Optional<Customer> getById(Short id);
}
