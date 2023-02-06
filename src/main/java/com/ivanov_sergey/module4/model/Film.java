package com.ivanov_sergey.module4.model;

import com.ivanov_sergey.module4.enums.Rating;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.sql.Date;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter @Setter
@Entity
@Table(name = "film", schema = "module4", catalog = "")
public class Film {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "film_id")
    private Integer filmId;
    @Basic
    @Column(name = "title", length = 128)
    private String title;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "release_year")
    private Date releaseYear;
    @Basic
    @Column(name = "language_id")
    private Integer languageId;
    @Basic
    @Column(name = "original_language_id")
    private Integer originalLanguageId;
    @Basic
    @Column(name = "rental_duration")
    private Integer rentalDuration;
    @Basic
    @Column(name = "rental_rate")
    private Double rentalRate;
    @Basic
    @Column(name = "length")
    private Integer length;
    @Basic
    @Column(name = "replacement_cost")
    private Double replacementCost;
    @Basic
    @Column(name = "rating")
    private Rating rating;
    @Basic
    @Column(name = "special_features")
    private String specialFeatures;
    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film that = (Film) o;
        return Objects.equals(filmId, that.filmId)
                && Objects.equals(title, that.title)
                && Objects.equals(description, that.description)
                && Objects.equals(releaseYear, that.releaseYear)
                && Objects.equals(languageId, that.languageId)
                && Objects.equals(originalLanguageId, that.originalLanguageId)
                && Objects.equals(rentalDuration, that.rentalDuration)
                && Objects.equals(rentalRate, that.rentalRate)
                && Objects.equals(length, that.length)
                && Objects.equals(replacementCost, that.replacementCost)
                && Objects.equals(rating, that.rating) && Objects.equals(specialFeatures, that.specialFeatures)
                && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, title, description, releaseYear, languageId, originalLanguageId, rentalDuration, rentalRate, length, replacementCost, rating, specialFeatures, lastUpdate);
    }
}
