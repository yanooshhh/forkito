package com.yanoosh.forkito.entity;

import com.yanoosh.forkito.enums.MeasurementUnit;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecipeIngredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "INGREDIENT_ID", nullable = false)
    private Ingredient ingredient;

    @ManyToOne
    @JoinColumn(name = "RECIPE_ID", nullable = false)
    private Recipe recipe;

    @NotNull
    @Enumerated(value = EnumType.STRING)
    private MeasurementUnit measurementUnit;

    @NotNull
    @Positive
    private BigDecimal quantity;
}
