package org.FastFoodGroup.FastFood.food.mapping;

import org.FastFoodGroup.FastFood.food.domain.model.entity.Recipe;
import org.FastFoodGroup.FastFood.food.resource.CreateRecipeResource;
import org.FastFoodGroup.FastFood.food.resource.RecipeResource;
import org.FastFoodGroup.FastFood.food.resource.UpdateRecipeResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.FastFoodGroup.FastFood.shared.mapping.EnhancedModelMapper;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Mapper class for converting between Recipe entities and their corresponding resource representations.
 * Uses EnhancedModelMapper for mapping functionality.
 * This class is responsible for mapping between CreateRecipeResource, UpdateRecipeResource, Recipe, and RecipeResource.
 *
 * @author Mauricio Oliveira Paucar
 * @author Sebastian Castro Soto
 * @author Jean Carlos Achamizo Huamani
 * @author Nicolás Zagal Vallejo
 * @since 1.0
 */
@Component
public class RecipeMapper implements Serializable {

    @Autowired
    private EnhancedModelMapper mapper;

    /**
     * Converts a CreateRecipeResource to a Recipe entity.
     *
     * @param resource The CreateRecipeResource to be converted
     * @return The corresponding Recipe entity
     */
    public Recipe toModel(CreateRecipeResource resource) {
        return this.mapper.map(resource, Recipe.class);
    }

    /**
     * Converts an UpdateRecipeResource to a Recipe entity.
     *
     * @param resource The UpdateRecipeResource to be converted
     * @return The corresponding Recipe entity
     */
    public Recipe toModel(UpdateRecipeResource resource) {
        return this.mapper.map(resource, Recipe.class);
    }

    /**
     * Converts a Recipe entity to a RecipeResource.
     *
     * @param recipe The Recipe entity to be converted
     * @return The corresponding RecipeResource
     */
    public RecipeResource toResource(Recipe recipe) {
        return this.mapper.map(recipe, RecipeResource.class);
    }
}
