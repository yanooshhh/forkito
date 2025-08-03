package com.yanoosh.forkito.model;

import com.yanoosh.forkito.enums.MeasurementUnit;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ingredient {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    private String description;

    private String emoji;

    @NotNull
    @Enumerated(value = jakarta.persistence.EnumType.STRING)
    private MeasurementUnit defaultMeasurementUnit;

}
