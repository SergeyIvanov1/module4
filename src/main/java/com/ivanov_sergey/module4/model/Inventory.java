package com.ivanov_sergey.module4.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "inventory", schema = "module4", catalog = "")
public class InventoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "inventory_id")
    private Object inventoryId;
    @Basic
    @Column(name = "film_id")
    private Object filmId;
    @Basic
    @Column(name = "store_id")
    private Object storeId;
    @Basic
    @Column(name = "last_update")
    private Timestamp lastUpdate;

    public Object getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Object inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Object getFilmId() {
        return filmId;
    }

    public void setFilmId(Object filmId) {
        this.filmId = filmId;
    }

    public Object getStoreId() {
        return storeId;
    }

    public void setStoreId(Object storeId) {
        this.storeId = storeId;
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
        InventoryEntity that = (InventoryEntity) o;
        return Objects.equals(inventoryId, that.inventoryId) && Objects.equals(filmId, that.filmId) && Objects.equals(storeId, that.storeId) && Objects.equals(lastUpdate, that.lastUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inventoryId, filmId, storeId, lastUpdate);
    }
}
