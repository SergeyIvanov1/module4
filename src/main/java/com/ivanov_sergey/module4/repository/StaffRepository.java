package com.ivanov_sergey.module4.repository;

import com.ivanov_sergey.module4.model.Rental;
import com.ivanov_sergey.module4.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Byte> {
}
