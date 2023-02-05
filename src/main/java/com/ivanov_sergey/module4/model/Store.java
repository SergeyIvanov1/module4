package com.ivanov_sergey.module4.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "store", schema = "module4", catalog = "")
public class StoreEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "store_id")
    private Object storeId;
    @Basic
    @Column(name = "manager_staff_id")
    private Object managerStaffId;
    @Basic
    @Column(name = "address_id")
    private Object addressId;
    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;

    public Object getStoreId() {
        return storeId;
    }

    public void setStoreId(Object storeId) {
        this.storeId = storeId;
    }

    public Object getManagerStaffId() {
        return managerStaffId;
    }

    public void setManagerStaffId(Object managerStaffId) {
        this.managerStaffId = managerStaffId;
    }

    public Object getAddressId() {
        return addressId;
    }

    public void setAddressId(Object addressId) {
        this.addressId = addressId;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreEntity that = (StoreEntity) o;
        return Objects.equals(storeId, that.storeId) && Objects.equals(managerStaffId, that.managerStaffId) && Objects.equals(addressId, that.addressId) && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeId, managerStaffId, addressId, lastUpdate);
    }
}
