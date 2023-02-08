package com.ivanov_sergey.module4.model;

import com.ivanov_sergey.module4.enums.Rating;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter @Setter
@Entity
@Table(name = "film", schema = "movie")
public class Film {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "film_id")
    private Short filmId;

    @Column(name = "title", length = 128)
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "release_year", columnDefinition = "YEAR")
    private Short releaseYear;

    @ManyToOne
    @JoinColumn(name = "language_id", columnDefinition = "TINYINT")
    private Language language;

//    @ManyToOne
//    @JoinColumn(name = "language_id", columnDefinition = "TINYINT")
    @Transient
    private Language originalLanguageId;

    @Column(name = "rental_duration")
    private Byte rentalDuration;

    @Column(name = "rental_rate")
    private BigDecimal rentalRate;

    @Column(name = "length")
    private Short length;

    @Column(name = "replacement_cost")
    private BigDecimal replacementCost;

//    @Enumerated(EnumType.STRING)
//    @Column(name = "rating")
//    private Rating rating;
    @Column(name = "rating")
    private String rating;

    @Column(name = "special_features")
    private String specialFeatures;

    @UpdateTimestamp
    @Column(name = "last_update", columnDefinition = "TIMESTAMP")
    private LocalDateTime lastUpdate;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "film_actor",
            joinColumns = @JoinColumn(name = "film_id", referencedColumnName = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id", referencedColumnName = "actor_id")
    )
    @ToString.Exclude
    private List<Actor> actors;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "film_category",
            joinColumns = @JoinColumn(name = "film_id", referencedColumnName = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    )
    @ToString.Exclude
    private List<Category> categories;

    @OneToOne
    @JoinColumn(name = "film_id")
    private FilmText filmText;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(filmId, film.filmId)
                && Objects.equals(title, film.title)
                && Objects.equals(description, film.description)
                && Objects.equals(releaseYear, film.releaseYear)
                && Objects.equals(language, film.language)
                && Objects.equals(originalLanguageId, film.originalLanguageId)
                && Objects.equals(rentalDuration, film.rentalDuration)
                && Objects.equals(rentalRate, film.rentalRate)
                && Objects.equals(length, film.length)
                && Objects.equals(replacementCost, film.replacementCost)
                && rating == film.rating
                && Objects.equals(specialFeatures, film.specialFeatures)
                && Objects.equals(lastUpdate, film.lastUpdate)
                && Objects.equals(actors, film.actors)
                && Objects.equals(categories, film.categories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmId, title, description, releaseYear, language, originalLanguageId, rentalDuration, rentalRate, length, replacementCost, rating, specialFeatures, lastUpdate, actors, categories);
    }
}
