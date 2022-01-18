package com.yum.recipe.service;

import com.yum.recipe.model.Recipe;
import com.yum.recipe.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {
    @Autowired
    private RecipeRepository recipeRepository;

    public void createRecipe(Recipe recipe){
        recipeRepository.save(recipe);

    }
    public Recipe findRecipeById(Long id){
        Optional<Recipe> optionalRecipe = recipeRepository.findById(id);
        return optionalRecipe.get();
    }
    public void deleteRecipeById(Long id){
        recipeRepository.deleteById(id);
    }
    public void updateRecipe(Recipe recipe){
        Recipe savedRecipe = findRecipeById(recipe.getId());
        savedRecipe.setName(recipe.getName());
        savedRecipe.setIngredients(recipe.getIngredients());
        savedRecipe.setSteps(recipe.getSteps());
        recipeRepository.save(savedRecipe);
    }
    public List <Recipe> findRecipesByName (String name){
       List<Recipe> recipes = recipeRepository.findByNameContaining(name);
        return recipes;
    }

}
