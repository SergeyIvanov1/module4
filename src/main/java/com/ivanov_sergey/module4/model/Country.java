package com.ivanov_sergey.module4.model;

import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "country", schema = "movie")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Short id;

    @Column(name = "country", length = 50)
    private String title;

    @UpdateTimestamp
    @Column(name = "last_update")
    private Timestamp lastUpdate;
}
