package com.ivanov_sergey.module4.model;

import com.ivanov_sergey.module4.enums.Rating;
import lombok.*;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
@Table(name = "film", schema = "movie")
public class Film {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "film_id")
    private Short id;

    private String title;

    @Column(name = "description", columnDefinition = "text")
    @Type(type = "text")
    private String description;

    @Column(name = "release_year", columnDefinition = "YEAR")
    private Year year;

    @ManyToOne
    @JoinColumn(name = "language_id")
    private Language language;

    @ManyToOne
    @JoinColumn(name = "original_language_id")
//    @Transient
    private Language originalLanguage;

    @Column(name = "rental_duration")
    private Byte rentalDuration;

    @Column(name = "rental_rate")
    private BigDecimal rentalRate;

    private Short length;

    @Column(name = "replacement_cost")
    private BigDecimal replacementCost;

//    @Enumerated(EnumType.STRING)
    @Column(name = "rating", columnDefinition = "enum('G', 'PG', 'PG-13', 'R', 'NC-17')")
    private Rating rating;

    @Column(name = "special_features", columnDefinition = "set('Trailers', 'Commentaries', 'Deleted Scenes', 'Behind the Scenes')")
    private String specialFeatures;

    @UpdateTimestamp
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    @ManyToMany
    @JoinTable(name = "film_actor",
            joinColumns = @JoinColumn(name = "film_id", referencedColumnName = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id", referencedColumnName = "actor_id"))
    private Set<Actor> actors;

    @ManyToMany
    @JoinTable(name = "film_category",
            joinColumns = @JoinColumn(name = "film_id", referencedColumnName = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id", referencedColumnName = "category_id"))
    private Set<Category> categories;
}
