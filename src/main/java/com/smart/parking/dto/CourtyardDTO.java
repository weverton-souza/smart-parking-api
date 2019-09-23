package com.smart.parking.dto;

import com.smart.parking.abstracts.AbstractDataTransferObject;

import javax.validation.constraints.NotNull;

public class CourtyardDTO extends AbstractDataTransferObject {
    @NotNull
    private String name;
    @NotNull
    private String numberOfVacancies;
    @NotNull
    private String description;
    @NotNull
    private Double hourlyRate;

    public CourtyardDTO() {}

    public String getName() {
        return name;
    }

    public CourtyardDTO setName(final String name) {
        this.name = name;
        return this;
    }

    public String getNumberOfVacancies() {
        return numberOfVacancies;
    }

    public CourtyardDTO setNumberOfVacancies(final String numberOfVacancies) {
        this.numberOfVacancies = numberOfVacancies;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CourtyardDTO setDescription(final String description) {
        this.description = description;
        return this;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public CourtyardDTO setHourlyRate(final Double hourlyRate) {
        this.hourlyRate = hourlyRate;
        return this;
    }
}
