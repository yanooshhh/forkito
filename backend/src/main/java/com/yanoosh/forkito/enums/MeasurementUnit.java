package com.yanoosh.forkito.enums;

public enum MeasurementUnit {
    GRAMS("g"),
    KILOGRAMS("kg"),
    LITERS("l"),
    MILLILITERS("ml"),
    TABLESPOONS("tbsp"),
    TEASPOONS("tsp"),
    PIECES("pcs");

    private final String abbreviation;

    MeasurementUnit(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
