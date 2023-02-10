package com.ivanov_sergey.module4.repository;

import com.ivanov_sergey.module4.model.City;
import com.ivanov_sergey.module4.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Short> {
}
