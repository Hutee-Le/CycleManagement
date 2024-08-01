package com.nut.CycleManagement.models;


import com.nut.CycleManagement.entities.RoleEntity;

public class UserDTO extends BaseDTO {
    private String email;

    private String password;

    private RoleEntity roleEntity;


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
}
