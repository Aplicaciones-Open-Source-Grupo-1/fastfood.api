package org.FastFoodGroup.FastFood.food.resource;

import lombok.*;

/**
 * Resource class representing the data of a Recipe for external representation.
 * This class is used to expose Recipe data in the Fast Food application's API.
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
@NoArgsConstructor
@AllArgsConstructor
public class RecipeResource {

    /**
     * Unique identifier for the recipe.
     */
    private Integer id;

    /**
     * Name of the recipe.
     */
    private String name;

    /**
     * URL or path to the photo of the recipe.
     */
    private String photo;

    /**
     * Duration of the recipe preparation in minutes.
     */
    private Integer duration;

    /**
     * Stars rating of the recipe (from 1 to 5).
     */
    private Integer stars;

    /**
     * Description of the recipe.
     */
    private String description;

    /**
     * Step-by-step preparation instructions.
     */
    private String preparation;
}

