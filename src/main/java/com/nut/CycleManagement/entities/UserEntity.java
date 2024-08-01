package com.nut.CycleManagement.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tbl_users")
public class UserEntity extends BaseEntity {

    private static final long serialversionUID = 1L;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private RoleEntity roleEntity;

    @OneToMany(mappedBy="user_id")
    private List<VehicleEntity> vehicleEntityList;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleEntity getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(RoleEntity roleEntity) {
        this.roleEntity = roleEntity;
    }

    public List<VehicleEntity> getVehicleEntityList() {
        return vehicleEntityList;
    }

    public void setVehicleEntityList(List<VehicleEntity> vehicleEntityList) {
        this.vehicleEntityList = vehicleEntityList;
    }
}
