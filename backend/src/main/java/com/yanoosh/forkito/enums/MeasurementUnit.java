package com.yanoosh.forkito.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MeasurementUnit {
    GRAMS("g"),
    KILOGRAMS("kg"),
    LITERS("l"),
    MILLILITERS("ml"),
    TABLESPOONS("tbsp"),
    TEASPOONS("tsp"),
    PIECES("pcs");

    private final String abbreviation;
}
