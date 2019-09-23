package com.smart.parking.domain;

import com.smart.parking.abstracts.AbstractDomain;

import javax.persistence.Entity;

@Entity
public class Vehicle extends AbstractDomain {
    private String model;
    private String licencePlate;
    private String color;

    public Vehicle() {}

    public String getModel() {
        return model;
    }

    public Vehicle setModel(final String model) {
        this.model = model;
        return this;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public Vehicle setLicencePlate(final String licencePlate) {
        this.licencePlate = licencePlate;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Vehicle setColor(final String color) {
        this.color = color;
        return this;
    }
}
