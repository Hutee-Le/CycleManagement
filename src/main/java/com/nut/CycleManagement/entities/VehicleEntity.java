package com.nut.CycleManagement.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_vehicles")
public class VehicleEntity extends BaseEntity{

    @Column(nullable = false)
    private String make;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private int year;

    @Column
    private boolean isDeleted;

    @Column
    private int user_id;

    @OneToMany(mappedBy="vehicle_id")
    private List<MaintenaceRecordEntity> maintenaceRecordEntityList;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public List<MaintenaceRecordEntity> getMaintenaceRecordEntityList() {
        return maintenaceRecordEntityList;
    }

    public void setMaintenaceRecordEntityList(List<MaintenaceRecordEntity> maintenaceRecordEntityList) {
        this.maintenaceRecordEntityList = maintenaceRecordEntityList;
    }
}
