package com.ivanov_sergey.module4.model;

import lombok.*;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "staff", schema = "module4")
public class Staff {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "staff_id")
    private Integer staffId;
    @Basic
    @Column(name = "first_name", length = 45)
    private String firstName;
    @Basic
    @Column(name = "last_name", length = 45)
    private String lastName;
    @Basic
    @Column(name = "address_id")
    private Integer addressId;
    @Basic
    @Column(name = "picture")
    private Blob picture;
    @Basic
    @Column(name = "email", length = 50)
    private String email;
    @Basic
    @Column(name = "store_id")
    private Integer storeId;
    @Basic
    @Column(name = "active")
    private boolean active;
    @Basic
    @Column(name = "username", length = 16)
    private String username;
    @Basic
    @Column(name = "password", length = 40)
    private String password;
    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return active == staff.active
                && Objects.equals(staffId, staff.staffId)
                && Objects.equals(firstName, staff.firstName)
                && Objects.equals(lastName, staff.lastName)
                && Objects.equals(addressId, staff.addressId)
                && Objects.equals(picture, staff.picture)
                && Objects.equals(email, staff.email)
                && Objects.equals(storeId, staff.storeId)
                && Objects.equals(username, staff.username)
                && Objects.equals(password, staff.password)
                && Objects.equals(lastUpdate, staff.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(staffId, firstName, lastName, addressId, picture, email, storeId, active, username, password, lastUpdate);
    }
}
