package com.ivanov_sergey.module4.service.impl;

import com.ivanov_sergey.module4.model.Rental;
import com.ivanov_sergey.module4.repository.RentalRepository;
import com.ivanov_sergey.module4.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RentalServiceImpl implements RentalService {

    private final RentalRepository rentalRepository;

    @Autowired
    public RentalServiceImpl(RentalRepository rentalRepository) {
        this.rentalRepository = rentalRepository;
    }

    @Override
    public Rental saveOrUpdateRental(Rental rental) {
        return rentalRepository.save(rental);
    }

    public Optional<Rental> getById(Integer id) {
        return rentalRepository.findById(id);
    }
}
