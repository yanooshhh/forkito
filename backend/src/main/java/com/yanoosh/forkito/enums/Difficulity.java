package com.yanoosh.forkito.enums;

public enum Difficulity {
    EASY("Easy"),
    MEDIUM("Medium"),
    HARD("Hard");

    private final String description;

    Difficulity(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
