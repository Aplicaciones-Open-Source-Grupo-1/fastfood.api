package org.FastFoodGroup.FastFood.food.mapping;

import org.FastFoodGroup.FastFood.food.domain.model.entity.Recipe;
import org.FastFoodGroup.FastFood.food.resource.CreateRecipeResource;
import org.FastFoodGroup.FastFood.food.resource.RecipeResource;
import org.FastFoodGroup.FastFood.food.resource.UpdateRecipeResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.FastFoodGroup.FastFood.shared.mapping.EnhancedModelMapper;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component

public class RecipeMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;
    public Recipe toModel(CreateRecipeResource resource) { return this.mapper.map(resource, Recipe.class); }
    public Recipe toModel(UpdateRecipeResource resource) {
        return this.mapper.map(resource, Recipe.class);
    }
    public RecipeResource toResource(Recipe recipe) {
        return this.mapper.map(recipe, RecipeResource.class);
    }
}
