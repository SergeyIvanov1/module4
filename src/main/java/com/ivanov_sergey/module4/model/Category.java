package com.ivanov_sergey.module4.model;

import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
@Table(name = "category", schema = "movie")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Byte categoryId;

    @Column(name = "name", length = 25)
    private String name;

    @UpdateTimestamp
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    @ManyToMany
    @JoinTable(name = "film_category",
            joinColumns = @JoinColumn(name = "category_id", referencedColumnName = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id", referencedColumnName = "film_id"))
    private Set<Film> films;
}
