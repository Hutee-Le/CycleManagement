package com.nut.CycleManagement.models;

import jakarta.persistence.Column;

import java.math.BigDecimal;
import java.util.Date;

public class MaintenaceRecordDTO extends BaseDTO {
    private String description;

    private Date service_date;

    private BigDecimal cost;

    private boolean isDeleted;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getService_date() {
        return service_date;
    }

    public void setService_date(Date service_date) {
        this.service_date = service_date;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
