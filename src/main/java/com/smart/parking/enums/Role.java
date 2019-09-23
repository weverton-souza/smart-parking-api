package com.smart.parking.enums;

/**
 * @author Weverton Souza.
 * Created on 19/09/19
 */
public enum Role {
    ADM_LEV1("ADM_LEV1", "Administrative Access; Level 01.");

    private String name;
    private String description;

    Role(final String name, final String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
