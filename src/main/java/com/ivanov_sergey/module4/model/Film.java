package com.ivanov_sergey.module4.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter @Setter
@Entity
@Table(name = "film", schema = "module4", catalog = "")
public class FilmEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "film_id")
    private Object filmId;
    @Basic
    @Column(name = "title")
    private String title;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "release_year")
    private Object releaseYear;
    @Basic
    @Column(name = "language_id")
    private Object languageId;
    @Basic
    @Column(name = "original_language_id")
    private Object originalLanguageId;
    @Basic
    @Column(name = "rental_duration")
    private Object rentalDuration;
    @Basic
    @Column(name = "rental_rate")
    private BigDecimal rentalRate;
    @Basic
    @Column(name = "length")
    private Object length;
    @Basic
    @Column(name = "replacement_cost")
    private BigDecimal replacementCost;
    @Basic
    @Column(name = "rating")
    private Object rating;
    @Basic
    @Column(name = "special_features")
    private Object specialFeatures;
    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;
}
