package com.smart.parking.dto;

import com.smart.parking.abstracts.AbstractDataTransferObject;
import com.smart.parking.abstracts.AbstractDomain;

import javax.persistence.Entity;

public class CustomerDTO extends AbstractDataTransferObject {
    private String name;
    private String cpf;
    private String phoneNumber;

    public CustomerDTO() {}

    public String getName() {
        return name;
    }

    public CustomerDTO setName(final String name) {
        this.name = name;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public CustomerDTO setCpf(final String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public CustomerDTO setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
