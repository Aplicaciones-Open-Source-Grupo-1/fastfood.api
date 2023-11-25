package org.FastFoodGroup.FastFood.food.resource;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/**
 * Resource class representing the data required to update an existing Recipe.
 * This class is used for input when updating an existing recipe in the Fast Food application.
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
public class UpdateRecipeResource {

    /**
     * Unique identifier for the recipe.
     */
    @NotNull
    @NotBlank
    @Min(1)
    private Integer id;

    /**
     * Name of the recipe.
     */
    @NotNull
    @NotBlank
    private String name;

    /**
     * URL or path to the photo of the recipe.
     */
    @NotNull
    @NotBlank
    private String photo;

    /**
     * Duration of the recipe preparation in minutes.
     */
    @NotNull
    @NotBlank
    @Min(1)
    private Integer duration;

    /**
     * Stars rating of the recipe (from 1 to 5).
     */
    @NotNull
    @NotBlank
    @Min(1)
    @Max(5)
    private Integer stars;

    /**
     * Description of the recipe.
     */
    @NotNull
    @NotBlank
    private String description;

    /**
     * Step-by-step preparation instructions.
     */
    @NotNull
    @NotBlank
    private String preparation;
}

