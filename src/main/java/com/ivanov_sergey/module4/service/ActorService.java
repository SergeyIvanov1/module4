package com.ivanov_sergey.module4.service;

import com.ivanov_sergey.module4.model.Actor;

import java.util.List;
import java.util.Optional;

public interface ActorService {
//    Rental saveOrUpdateRental(Rental rental);
//     Optional<Rental> getById(Integer id);
    List<Actor> getAllActors();
    Optional<Actor> getById(Short id);
}
