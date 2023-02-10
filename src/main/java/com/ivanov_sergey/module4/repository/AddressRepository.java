package com.ivanov_sergey.module4.repository;

import com.ivanov_sergey.module4.model.Address;
import com.ivanov_sergey.module4.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Short> {
}
