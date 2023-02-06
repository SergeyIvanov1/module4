package com.ivanov_sergey.module4.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "payment", schema = "module4")
public class Payment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "payment_id")
    private Integer paymentId;
    @Basic
    @Column(name = "customer_id")
    private Integer customerId;
    @Basic
    @Column(name = "staff_id")
    private Integer staffId;
    @Basic
    @Column(name = "rental_id")
    private Integer rentalId;
    @Basic
    @Column(name = "amount")
    private Double amount;
    @Basic
    @Column(name = "payment_date")
    private LocalDateTime paymentDate;
    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment that = (Payment) o;
        return Objects.equals(paymentId, that.paymentId)
                && Objects.equals(customerId, that.customerId)
                && Objects.equals(staffId, that.staffId)
                && Objects.equals(rentalId, that.rentalId)
                && Objects.equals(amount, that.amount)
                && Objects.equals(paymentDate, that.paymentDate)
                && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentId, customerId, staffId, rentalId, amount, paymentDate, lastUpdate);
    }
}
