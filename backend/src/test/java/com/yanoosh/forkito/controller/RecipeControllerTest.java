package com.yanoosh.forkito.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yanoosh.forkito.dto.RecipeInstruction;
import com.yanoosh.forkito.entity.Recipe;
import com.yanoosh.forkito.enums.Difficulity;
import com.yanoosh.forkito.enums.MealType;
import com.yanoosh.forkito.service.RecipeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
@DisplayName("Recipe Controller Tests")
public class RecipeControllerTest {

    private MockMvc mockMvc;

    @Mock
    private RecipeService recipeService;

    @InjectMocks
    private RecipeController recipeController;

    private ObjectMapper objectMapper;
    private Recipe testRecipe1;
    private Recipe testRecipe2;
    private UUID recipeId1;
    private UUID recipeId2;

    @BeforeEach
    void setUp() {
        // Initialize MockMvc
        mockMvc = MockMvcBuilders.standaloneSetup(recipeController).build();
        objectMapper = new ObjectMapper();

        recipeId1 = UUID.fromString("a1b2c3d4-e5f6-7890-abcd-ef1234567890");
        recipeId2 = UUID.fromString("b2c3d4e5-f6a7-8901-bcde-f23456789012");

        // Create test recipe instructions
        List<RecipeInstruction> instructions1 = Arrays.asList(
            new RecipeInstruction(1, "Mix flour with eggs"),
            new RecipeInstruction(2, "Add milk gradually"),
            new RecipeInstruction(3, "Cook on medium heat")
        );

        List<RecipeInstruction> instructions2 = Arrays.asList(
            new RecipeInstruction(1, "Boil pasta according to package instructions"),
            new RecipeInstruction(2, "Fry bacon until crispy"),
            new RecipeInstruction(3, "Mix with cheese and eggs")
        );

        // Create test recipes
        testRecipe1 = new Recipe();
        testRecipe1.setId(recipeId1);
        testRecipe1.setTitle("Basic Pancakes");
        testRecipe1.setDescription("Classic pancakes for breakfast");
        testRecipe1.setDifficulity(Difficulity.EASY);
        testRecipe1.setMealType(MealType.BREAKFAST);
        testRecipe1.setInstructions(instructions1);

        testRecipe2 = new Recipe();
        testRecipe2.setId(recipeId2);
        testRecipe2.setTitle("Spaghetti Carbonara");
        testRecipe2.setDescription("Italian pasta with eggs and bacon");
        testRecipe2.setDifficulity(Difficulity.MEDIUM);
        testRecipe2.setMealType(MealType.DINNER);
        testRecipe2.setInstructions(instructions2);
    }

    @Test
    @DisplayName("GET /api/recipes - Should return all recipes")
    void shouldReturnAllRecipes() throws Exception {
        // Given
        List<Recipe> recipes = Arrays.asList(testRecipe1, testRecipe2);
        when(recipeService.getAllRecipes()).thenReturn(recipes);

        // When & Then
        mockMvc.perform(get("/api/recipes"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].id", is(recipeId1.toString())))
                .andExpect(jsonPath("$[0].title", is("Basic Pancakes")))
                .andExpect(jsonPath("$[0].description", is("Classic pancakes for breakfast")))
                .andExpect(jsonPath("$[0].difficulity", is("EASY")))
                .andExpect(jsonPath("$[0].mealType", is("BREAKFAST")))
                .andExpect(jsonPath("$[0].instructions", hasSize(3)))
                .andExpect(jsonPath("$[0].instructions[0].stepNumber", is(1)))
                .andExpect(jsonPath("$[0].instructions[0].instruction", is("Mix flour with eggs")))
                .andExpect(jsonPath("$[1].id", is(recipeId2.toString())))
                .andExpect(jsonPath("$[1].title", is("Spaghetti Carbonara")))
                .andExpect(jsonPath("$[1].difficulity", is("MEDIUM")))
                .andExpect(jsonPath("$[1].mealType", is("DINNER")));

        verify(recipeService, times(1)).getAllRecipes();
    }

    @Test
    @DisplayName("GET /api/recipes - Should return empty list when no recipes exist")
    void shouldReturnEmptyListWhenNoRecipesExist() throws Exception {
        // Given
        when(recipeService.getAllRecipes()).thenReturn(Arrays.asList());

        // When & Then
        mockMvc.perform(get("/api/recipes"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(0)));

        verify(recipeService, times(1)).getAllRecipes();
    }

    @Test
    @DisplayName("GET /api/recipes/{id} - Should return recipe by ID")
    void shouldReturnRecipeById() throws Exception {
        // Given
        when(recipeService.getRecipeById(recipeId1)).thenReturn(testRecipe1);

        // When & Then
        mockMvc.perform(get("/api/recipes/{id}", recipeId1))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id", is(recipeId1.toString())))
                .andExpect(jsonPath("$.title", is("Basic Pancakes")))
                .andExpect(jsonPath("$.description", is("Classic pancakes for breakfast")))
                .andExpect(jsonPath("$.difficulity", is("EASY")))
                .andExpect(jsonPath("$.mealType", is("BREAKFAST")))
                .andExpect(jsonPath("$.instructions", hasSize(3)));

        verify(recipeService, times(1)).getRecipeById(recipeId1);
    }

    @Test
    @DisplayName("GET /api/recipes/{id} - Should return null when recipe not found")
    void shouldReturnNullWhenRecipeNotFound() throws Exception {
        // Given
        UUID nonExistentId = UUID.fromString("99999999-9999-9999-9999-999999999999");
        when(recipeService.getRecipeById(nonExistentId)).thenReturn(null);

        // When & Then
        mockMvc.perform(get("/api/recipes/{id}", nonExistentId))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(""));

        verify(recipeService, times(1)).getRecipeById(nonExistentId);
    }

    @Test
    @DisplayName("POST /api/recipes - Should create new recipe")
    void shouldCreateNewRecipe() throws Exception {
        // Given
        Recipe newRecipe = new Recipe();
        newRecipe.setTitle("Test Recipe");
        newRecipe.setDescription("Test Description");
        newRecipe.setDifficulity(Difficulity.EASY);
        newRecipe.setMealType(MealType.LUNCH);
        newRecipe.setInstructions(Arrays.asList(
            new RecipeInstruction(1, "Test instruction")
        ));

        Recipe savedRecipe = new Recipe();
        savedRecipe.setId(UUID.randomUUID());
        savedRecipe.setTitle("Test Recipe");
        savedRecipe.setDescription("Test Description");
        savedRecipe.setDifficulity(Difficulity.EASY);
        savedRecipe.setMealType(MealType.LUNCH);
        savedRecipe.setInstructions(Arrays.asList(
            new RecipeInstruction(1, "Test instruction")
        ));

        when(recipeService.createRecipe(any(Recipe.class))).thenReturn(savedRecipe);

        // When & Then
        mockMvc.perform(post("/api/recipes")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(newRecipe)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").exists())
                .andExpect(jsonPath("$.title", is("Test Recipe")))
                .andExpect(jsonPath("$.description", is("Test Description")))
                .andExpect(jsonPath("$.difficulity", is("EASY")))
                .andExpect(jsonPath("$.mealType", is("LUNCH")))
                .andExpect(jsonPath("$.instructions", hasSize(1)));

        verify(recipeService, times(1)).createRecipe(any(Recipe.class));
    }

    @Test
    @DisplayName("POST /api/recipes - Should handle invalid JSON")
    void shouldHandleInvalidJson() throws Exception {
        // When & Then
        mockMvc.perform(post("/api/recipes")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{ invalid json }"))
                .andDo(print())
                .andExpect(status().isBadRequest());

        verify(recipeService, never()).createRecipe(any(Recipe.class));
    }

    @Test
    @DisplayName("DELETE /api/recipes/{id} - Should delete recipe by ID")
    void shouldDeleteRecipeById() throws Exception {
        // Given
        doNothing().when(recipeService).deleteRecipe(recipeId1);

        // When & Then
        mockMvc.perform(delete("/api/recipes/{id}", recipeId1))
                .andDo(print())
                .andExpect(status().isOk());

        verify(recipeService, times(1)).deleteRecipe(recipeId1);
    }

    @Test
    @DisplayName("DELETE /api/recipes/{id} - Should handle deletion of non-existent recipe")
    void shouldHandleDeletionOfNonExistentRecipe() throws Exception {
        // Given
        UUID nonExistentId = UUID.fromString("99999999-9999-9999-9999-999999999999");
        doNothing().when(recipeService).deleteRecipe(nonExistentId);

        // When & Then
        mockMvc.perform(delete("/api/recipes/{id}", nonExistentId))
                .andDo(print())
                .andExpect(status().isOk());

        verify(recipeService, times(1)).deleteRecipe(nonExistentId);
    }

    @Test
    @DisplayName("Should handle invalid UUID format in path variable")
    void shouldHandleInvalidUuidFormat() throws Exception {
        // When & Then
        mockMvc.perform(get("/api/recipes/{id}", "invalid-uuid"))
                .andDo(print())
                .andExpect(status().isBadRequest());

        verify(recipeService, never()).getRecipeById(any(UUID.class));
    }
}
