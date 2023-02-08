package com.ivanov_sergey.module4.service.impl;

import com.ivanov_sergey.module4.model.Customer;
import com.ivanov_sergey.module4.repository.CustomerRepository;
import com.ivanov_sergey.module4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
