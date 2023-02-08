package com.ivanov_sergey.module4.repository;

import com.ivanov_sergey.module4.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Short> {
}
