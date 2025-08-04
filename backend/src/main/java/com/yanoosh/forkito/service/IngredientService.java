package com.yanoosh.forkito.service;

import com.yanoosh.forkito.entity.Ingredient;
import com.yanoosh.forkito.repository.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    public Ingredient getIngredientById(UUID id) {
        return ingredientRepository.findById(id).orElse(null);
    }

    public Ingredient createIngredient(Ingredient ingredient) {
        return ingredientRepository.save(ingredient);
    }

    public void deleteIngredient(UUID id) {
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
