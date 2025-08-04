package com.yanoosh.forkito.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecipeInstruction {

    @Positive
    private int stepNumber;

    @NotBlank
    private String instruction;
}
