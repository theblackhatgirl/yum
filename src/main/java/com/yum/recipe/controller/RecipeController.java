package com.yum.recipe.controller;

import com.yum.recipe.model.Recipe;
import com.yum.recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {
    @Autowired
    private RecipeService recipeService;

    @PostMapping(path = "/recipes")
    public void createRecipe(@RequestBody Recipe recipe){
        recipeService.createRecipe(recipe);
    }
    @GetMapping(path = "/recipes/{id}")
    public Recipe findRecipeById(@PathVariable Long id){
       return recipeService.findRecipeById(id);
    }
    @DeleteMapping(path = "/recipes/{id}")
    public void deleteRecipeById(@PathVariable Long id){
        recipeService.deleteRecipeById(id);
    }
    @PutMapping(path = "/recipes")
    public void updateRecipe(@RequestBody Recipe recipe){
        recipeService.updateRecipe(recipe);
    }
    @GetMapping(path = "/recipes")
    public List<Recipe> findRecipesByName(@RequestParam String name){
        return recipeService.findRecipesByName(name);
    }
}
