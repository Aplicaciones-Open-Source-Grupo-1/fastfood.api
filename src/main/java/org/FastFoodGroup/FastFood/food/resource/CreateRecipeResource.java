package org.FastFoodGroup.FastFood.food.resource;

import jakarta.validation.constraints.NotNull;
import lombok.*;

/**
 * Resource class representing the data required to create a new Recipe.
 * This class is used for input when creating a new recipe in the Fast Food application.
 *
 * @author Mauricio Oliveira Paucar
 * @author Sebastian Castro Soto
 * @author Jean Carlos Achamizo Huamani
 * @author Nicolás Zagal Vallejo
 * @since 1.0
 */
@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
public class CreateRecipeResource {

    /**
     * Unique identifier for the recipe.
     */
    @NotNull
    private Integer recipeId;

    /**
     * Name of the recipe.
     */
    @NotNull
    private String name;

    /**
     * URL or path to the photo of the recipe.
     */
    @NotNull
    private String photo;

    /**
     * Duration of the recipe preparation in minutes.
     */
    @NotNull
    private Integer duration;

    /**
     * Stars rating of the recipe (from 1 to 5).
     */
    @NotNull
    private Integer stars;

    /**
     * Description of the recipe.
     */
    @NotNull
    private String description;

    /**
     * Step-by-step preparation instructions.
     */
    @NotNull
    private String preparation;
}

