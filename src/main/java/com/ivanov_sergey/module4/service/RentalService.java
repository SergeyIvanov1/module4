package com.ivanov_sergey.module4.service;

import com.ivanov_sergey.module4.model.Rental;

import java.util.Optional;

public interface RentalService {
    Rental saveOrUpdateRental(Rental rental);
     Optional<Rental> getById(Integer id);
}
