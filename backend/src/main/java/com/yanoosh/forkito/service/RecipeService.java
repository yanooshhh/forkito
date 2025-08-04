package com.yanoosh.forkito.service;

import com.yanoosh.forkito.entity.Recipe;
import com.yanoosh.forkito.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    public Recipe getRecipeById(UUID id) {
        return recipeRepository.findById(id).orElse(null);
    }

    public Recipe createRecipe(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public void deleteRecipe(UUID id) {
        recipeRepository.deleteById(id);
    }
}
