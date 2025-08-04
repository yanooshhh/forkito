package com.yanoosh.forkito.repository;

import com.yanoosh.forkito.entity.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Long> {
    // Additional query methods can be defined here if needed
}
