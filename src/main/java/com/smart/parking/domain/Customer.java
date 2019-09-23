package com.smart.parking.domain;

import com.smart.parking.abstracts.AbstractDomain;

import javax.persistence.Entity;

@Entity
public class Customer extends AbstractDomain {
    private String name;
    private String cpf;
    private String phoneNumber;

    public Customer() {}

    public String getName() {
        return name;
    }

    public Customer setName(final String name) {
        this.name = name;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public Customer setCpf(final String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Customer setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
