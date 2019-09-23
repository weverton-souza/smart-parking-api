package com.smart.parking.dto;

import com.smart.parking.abstracts.AbstractDataTransferObject;

import javax.validation.constraints.NotNull;

public class VehicleDTO extends AbstractDataTransferObject {
    @NotNull
    private String model;
    @NotNull
    private String licencePlate;
    @NotNull
    private String color;

    public VehicleDTO() {}

    public String getModel() {
        return model;
    }

    public VehicleDTO setModel(final String model) {
        this.model = model;
        return this;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public VehicleDTO setLicencePlate(final String licencePlate) {
        this.licencePlate = licencePlate;
        return this;
    }

    public String getColor() {
        return color;
    }

    public VehicleDTO setColor(final String color) {
        this.color = color;
        return this;
    }
}
