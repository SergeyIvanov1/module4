package com.ivanov_sergey.module4.service.impl;

import com.ivanov_sergey.module4.model.Actor;
import com.ivanov_sergey.module4.repository.ActorRepository;
import com.ivanov_sergey.module4.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorServiceImpl implements ActorService {

    private final ActorRepository actorRepository;

    @Autowired
        public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }

    @Override
    public Optional<Actor> getById(Short id) {
        return actorRepository.findById(id);
    }

//    @Override
//    public Customer createCustomer(Customer customer) {
//        return customerRepository.save(customer);
//    }
//
//    @Override
//    public Optional<Customer> getById(Short id) {
//        return customerRepository.findById(id);
//    }
}
