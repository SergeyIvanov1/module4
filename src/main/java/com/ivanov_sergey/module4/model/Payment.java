package com.ivanov_sergey.module4.model;

import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

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
@Table(name = "payment", schema = "movie")
public class Payment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "payment_id")
    private Short paymentId;

    @ManyToOne
    @JoinColumn(name = "customer_id", columnDefinition = "SMALLINT")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "staff_id", columnDefinition = "TINYINT")
    private Staff staff;

    @ManyToOne
    @JoinColumn(name = "rental_id", columnDefinition = "INT")
    private Rental rentalId;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "payment_date", columnDefinition = "DATETIME")
    private LocalDateTime paymentDate;

    @UpdateTimestamp
    @Column(name = "last_update", columnDefinition = "TIMESTAMP")
    private Timestamp lastUpdate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(paymentId, payment.paymentId)
                && Objects.equals(customer, payment.customer)
                && Objects.equals(staff, payment.staff)
                && Objects.equals(rentalId, payment.rentalId)
                && Objects.equals(amount, payment.amount)
                && Objects.equals(paymentDate, payment.paymentDate)
                && Objects.equals(lastUpdate, payment.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paymentId, customer, staff, rentalId, amount, paymentDate, lastUpdate);
    }
}
