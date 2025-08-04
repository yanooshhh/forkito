package com.yanoosh.forkito.entity;

import com.yanoosh.forkito.dto.RecipeInstruction;
import com.yanoosh.forkito.enums.Difficulity;
import com.yanoosh.forkito.enums.MealType;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String title;

    private String description;

    @NotNull
    @Enumerated(value = EnumType.STRING)
    private Difficulity difficulity;

    @NotNull
    @Enumerated(value = EnumType.STRING)
    private MealType mealType;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<RecipeIngredient> recipeIngredients;

    @NotEmpty
    @Valid
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "JSON")
    private List<RecipeInstruction> instructions;
}
