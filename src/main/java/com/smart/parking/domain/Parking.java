package com.smart.parking.domain;

import com.smart.parking.abstracts.AbstractDomain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.sql.Timestamp;

@Entity
public class Parking extends AbstractDomain {
    @OneToOne
    private Customer customer;
    @OneToOne
    private Vehicle vehicle;
    private Timestamp parkingOn;
    private Timestamp parkingUntil;

    public Parking() {}

    public Customer getCustomer() {
        return customer;
    }

    public Parking setCustomer(final Customer customer) {
        this.customer = customer;
        return this;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Parking setVehicle(final Vehicle vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public Timestamp getParkingOn() {
        return parkingOn;
    }

    public Parking setParkingOn(final Timestamp parkingOn) {
        this.parkingOn = parkingOn;
        return this;
    }

    public Timestamp getParkingUntil() {
        return parkingUntil;
    }

    public Parking setParkingUntil(final Timestamp parkingUntil) {
        this.parkingUntil = parkingUntil;
        return this;
    }
}
