package com.smart.parking.dto;

import com.smart.parking.abstracts.AbstractDataTransferObject;
import com.smart.parking.domain.Customer;
import com.smart.parking.domain.Vehicle;

import java.sql.Timestamp;

public class ParkingDTO extends AbstractDataTransferObject {
    private Customer customer;
    private Vehicle vehicle;
    private Timestamp parkingOn;
    private Timestamp parkingUntil;

    public ParkingDTO() {}

    public Customer getCustomer() {
        return customer;
    }

    public ParkingDTO setCustomer(final Customer customer) {
        this.customer = customer;
        return this;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingDTO setVehicle(final Vehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public Timestamp getParkingOn() {
        return parkingOn;
    }

    public ParkingDTO setParkingOn(final Timestamp parkingOn) {
        this.parkingOn = parkingOn;
        return this;
    }

    public Timestamp getParkingUntil() {
        return parkingUntil;
    }

    public ParkingDTO setParkingUntil(final Timestamp parkingUntil) {
        this.parkingUntil = parkingUntil;
        return this;
    }
}
