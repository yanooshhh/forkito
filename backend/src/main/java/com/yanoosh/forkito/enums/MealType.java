package com.yanoosh.forkito.enums;

public enum MealType {
    BREAKFAST("Breakfast"),
    LUNCH("Lunch"),
    DINNER("Dinner"),
    SNACK("Snack"),
    DESSERT("Dessert");

    private final String description;

    MealType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
