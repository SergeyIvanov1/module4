package com.ivanov_sergey.module4.model;

import lombok.*;

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
@Table(name = "rental", schema = "module4")
public class Rental {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "rental_id")
    private Integer rentalId;
    @Basic
    @Column(name = "rental_date")
    private LocalDateTime rentalDate;
    @Basic
    @Column(name = "inventory_id")
    private Integer inventoryId;
    @Basic
    @Column(name = "customer_id")
    private Integer customerId;
    @Basic
    @Column(name = "return_date")
    private LocalDateTime returnDate;
    @Basic
    @Column(name = "staff_id")
    private Integer staffId;
    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rental that = (Rental) o;
        return rentalId == that.rentalId && Objects.equals(rentalDate, that.rentalDate)
                && Objects.equals(inventoryId, that.inventoryId)
                && Objects.equals(customerId, that.customerId)
                && Objects.equals(returnDate, that.returnDate)
                && Objects.equals(staffId, that.staffId)
                && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentalId, rentalDate, inventoryId, customerId, returnDate, staffId, lastUpdate);
    }
}
