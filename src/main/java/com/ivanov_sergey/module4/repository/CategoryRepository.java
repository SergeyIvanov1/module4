package com.ivanov_sergey.module4.repository;

import com.ivanov_sergey.module4.model.Category;
import com.ivanov_sergey.module4.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Byte> {
}
