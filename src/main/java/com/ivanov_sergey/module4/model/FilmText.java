package com.ivanov_sergey.module4.model;

import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "film_text", schema = "movie")
public class FilmText {
    @Id
    @Column(name = "film_id")
    private Short filmId;

    private String title;

    @Column(name = "description", columnDefinition = "text")
    @Type(type = "text")
    private String description;

    @OneToOne
    @JoinColumn(name = "film_id")
    private Film film;
}
