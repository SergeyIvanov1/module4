package com.ivanov_sergey.module4.model;

import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "language", schema = "movie")
public class Language {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "language_id")
    private Byte id;

    @Column(name = "name", length = 20, columnDefinition = "char")
    private String name;

    @UpdateTimestamp
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}
