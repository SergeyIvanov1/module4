package com.ivanov_sergey.module4.repository;

import com.ivanov_sergey.module4.model.FilmText;
import com.ivanov_sergey.module4.model.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmTextRepository extends JpaRepository<FilmText, Short> {
}
