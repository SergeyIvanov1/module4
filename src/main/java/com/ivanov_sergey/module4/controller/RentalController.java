package com.ivanov_sergey.module4.controller;

import com.ivanov_sergey.module4.model.Rental;
import com.ivanov_sergey.module4.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/rentals")
public class RentalController {

    private final RentalService rentalService;

    @Autowired
    public RentalController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @GetMapping("/rental/{id}")
    public Rental getRentalById(@PathVariable Integer id){
        Optional<Rental> byId = rentalService.getById(id);
        if(byId.isPresent()){
            return byId.get();
        } else {
            System.out.println("ENTITY IS EMPTY");
            throw new RuntimeException();
        }
    }

    @PostMapping("/rental")
    public Rental returnFilm(@RequestBody Rental rental){
        rentalService.saveOrUpdateRental(rental);
        return rental;
    }
}
