package com.ivanov_sergey.module4.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "film_actor", schema = "module4")
public class FilmActor {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "actor_id")
    private Integer actorId;

    @Column(name = "film_id")
    private Integer filmId;
    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmActor that = (FilmActor) o;
        return Objects.equals(actorId, that.actorId)
                && Objects.equals(filmId, that.filmId)
                && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actorId, filmId, lastUpdate);
    }
}
