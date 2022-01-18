package com.yum.recipe.repository;

import com.yum.recipe.model.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipeRepository extends CrudRepository <Recipe, Long> {
    List<Recipe> findByNameContaining(String name);

}

