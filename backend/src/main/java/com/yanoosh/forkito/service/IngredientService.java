package com.yanoosh.forkito.service;

import com.yanoosh.forkito.model.Ingredient;
import com.yanoosh.forkito.repository.IngredientRepository;
import com.yanoosh.forkito.repository.RecipeIngredientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    public Ingredient getIngredientById(Long id) {
        return ingredientRepository.findById(id).orElse(null);
    }

    public Ingredient createIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    public void deleteIngredient(Long id) {
        ingredientRepository.deleteById(id);
    }

    public void updateIngredient(Ingredient ingredient) {
        if (ingredientRepository.existsById(ingredient.getId())) {
            ingredientRepository.save(ingredient);
        } else {
            throw new IllegalArgumentException("Ingredient not found");
        }
    }

}
