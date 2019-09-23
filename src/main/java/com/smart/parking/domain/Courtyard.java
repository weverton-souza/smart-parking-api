package com.smart.parking.domain;

import com.smart.parking.abstracts.AbstractDomain;

import javax.persistence.Entity;

@Entity
public class Courtyard extends AbstractDomain {
    private String name;
    private String numberOfVacancies;
    private String description;
    private Double hourlyRate;

    public Courtyard() {}

    public String getName() {
        return name;
    }

    public Courtyard setName(final String name) {
        this.name = name;
        return this;
    }

    public String getNumberOfVacancies() {
        return numberOfVacancies;
    }

    public Courtyard setNumberOfVacancies(final String numberOfVacancies) {
        this.numberOfVacancies = numberOfVacancies;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Courtyard setDescription(final String description) {
        this.description = description;
        return this;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public Courtyard setHourlyRate(final Double hourlyRate) {
        this.hourlyRate = hourlyRate;
        return this;
    }
}
