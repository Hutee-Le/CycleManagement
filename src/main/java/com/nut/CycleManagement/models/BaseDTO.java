package com.nut.CycleManagement.models;

import jakarta.persistence.Column;

import java.sql.Date;

public abstract class BaseDTO {
    private int id;

    private int create_by;

    private Date create_at;

    private int update_by;

    private Date update_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreate_by() {
        return create_by;
    }

    public void setCreate_by(int create_by) {
        this.create_by = create_by;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public int getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(int update_by) {
        this.update_by = update_by;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }
}
