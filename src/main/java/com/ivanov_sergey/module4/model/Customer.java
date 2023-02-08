package com.ivanov_sergey.module4.model;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "customer", schema = "movie")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Short id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address addressId;

    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store storeId;

    @Column(name = "active", columnDefinition = "BIT")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean isActive;

    @CreationTimestamp
    @Column(name = "create_date")
    private LocalDateTime createDate;

    @UpdateTimestamp
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;
}
