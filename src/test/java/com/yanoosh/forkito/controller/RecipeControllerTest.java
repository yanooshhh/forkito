//package com.yanoosh.forkito.controller;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.yanoosh.forkito.model.Recipe;
//import com.yanoosh.forkito.service.RecipeService;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import java.util.List;
//
//import static org.hamcrest.Matchers.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@WebMvcTest(RecipeController.class)
//public class RecipeControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private RecipeService recipeService;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @Test
//    void shouldReturnAllRecipes() throws Exception {
//        Recipe r1 = new Recipe(1L, "Pizza", "Delicious pizza");
//        Recipe r2 = new Recipe(2L, "Soup", "Hot soup");
//
//        Mockito.when(recipeService.getAllRecipes()).thenReturn(List.of(r1, r2));
//
//        mockMvc.perform(get("/api/recipes"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$", hasSize(2)))
//                .andExpect(jsonPath("$[0].name", is("Pizza")))
//                .andExpect(jsonPath("$[1].description", is("Hot soup")));
//    }
//
//    @Test
//    void shouldCreateRecipe() throws Exception {
//        Recipe newRecipe = new Recipe(null, "Salad", "Fresh salad");
//        Recipe savedRecipe = new Recipe(3L, "Salad", "Fresh salad");
//
//        Mockito.when(recipeService.createRecipe(Mockito.any(Recipe.class))).thenReturn(savedRecipe);
//
//        mockMvc.perform(post("/api/recipes")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(objectMapper.writeValueAsString(newRecipe)))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.id", is(3)))
//                .andExpect(jsonPath("$.name", is("Salad")));
//    }
//
//    @Test
//    void shouldReturnRecipeById() throws Exception {
//        Recipe recipe = new Recipe(1L, "Pizza", "Delicious pizza");
//        Mockito.when(recipeService.getRecipeById(1L)).thenReturn(recipe);
//
//        mockMvc.perform(get("/api/recipes/1"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.name", is("Pizza")))
//                .andExpect(jsonPath("$.description", is("Delicious pizza")));
//    }
//
//    @Test
//    void shouldDeleteRecipe() throws Exception {
//        Mockito.doNothing().when(recipeService).deleteRecipe(1L);
//
//        mockMvc.perform(delete("/api/recipes/1"))
//                .andExpect(status().isOk());
//    }
//}
