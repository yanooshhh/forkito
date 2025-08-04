package com.yanoosh.forkito.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Difficulity {
    EASY("Easy"),
    MEDIUM("Medium"),
    HARD("Hard");

    private final String description;
}
