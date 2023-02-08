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
@Table(name = "rental", schema = "movie")
public class Rental {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "rental_id")
    private Integer id;

    @Column(name = "rental_date")
    private LocalDateTime rentalDate;

    @ManyToOne
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "return_date")
    private LocalDateTime returnDate;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;

    @UpdateTimestamp
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}
