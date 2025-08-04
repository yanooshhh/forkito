package com.yanoosh.forkito.repository;

import com.yanoosh.forkito.entity.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, UUID> {
    // Additional query methods can be defined here if needed
}
