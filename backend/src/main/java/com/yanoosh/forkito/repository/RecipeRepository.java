package com.yanoosh.forkito.repository;

import com.yanoosh.forkito.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    // Additional query methods can be defined here if needed
}
