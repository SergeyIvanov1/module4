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
@Table(name = "address", schema = "module4")
public class Address {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "address_id")
    private Integer addressId;
    @Basic
    @Column(name = "address", length = 50)
    private String address;
    @Basic
    @Column(name = "address2", length = 50)
    private String address2;
    @Basic
    @Column(name = "district")
    private String district;
    @Basic
    @Column(name = "city_id")
    private Integer cityId;
    @Basic
    @Column(name = "postal_code", length = 10)
    private String postalCode;
    @Basic
    @Column(name = "phone", length = 20)
    private String phone;
    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address that = (Address) o;
        return Objects.equals(addressId, that.addressId)
                && Objects.equals(address, that.address)
                && Objects.equals(address2, that.address2)
                && Objects.equals(district, that.district)
                && Objects.equals(cityId, that.cityId)
                && Objects.equals(postalCode, that.postalCode)
                && Objects.equals(phone, that.phone)
                && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, address, address2, district, cityId, postalCode, phone, lastUpdate);
    }
}
