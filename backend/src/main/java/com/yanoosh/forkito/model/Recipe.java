package com.yanoosh.forkito.model;

import com.yanoosh.forkito.enums.Difficulity;
import com.yanoosh.forkito.enums.MealType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    @Enumerated(value = EnumType.STRING)
    private Difficulity difficulity;

    @Enumerated(value = EnumType.STRING)
    private MealType mealType;

    @OneToMany
    @JoinColumn(name = "RECIPE_INGREDIENT_ID", nullable = false)
    private List<RecipeIngredient> recipeIngredients;

}
