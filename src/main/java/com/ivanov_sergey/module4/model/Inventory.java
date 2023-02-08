package com.ivanov_sergey.module4.model;

import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "inventory", schema = "movie")
public class Inventory {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "inventory_id")
    private Integer inventoryId;

    @UpdateTimestamp
    @Column(name = "last_update", columnDefinition = "TIMESTAMP")
    private LocalDateTime lastUpdate;

    @ManyToOne
    @JoinColumn(name = "film_id", columnDefinition = "SMALLINT")
    private Film film;

    @ManyToOne
    @JoinColumn(name = "store_id", columnDefinition = "TINYINT")
    private Store store;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inventory inventory = (Inventory) o;
        return Objects.equals(inventoryId, inventory.inventoryId) && Objects.equals(lastUpdate, inventory.lastUpdate) && Objects.equals(film, inventory.film) && Objects.equals(store, inventory.store);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inventoryId, lastUpdate, film, store);
    }
}
