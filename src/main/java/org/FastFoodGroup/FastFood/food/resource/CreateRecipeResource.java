package org.FastFoodGroup.FastFood.food.resource;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
public class CreateRecipeResource {
    @NotNull
    private Integer recipeId;
    @NotNull
    private String name;
    // photo
    @NotNull
    private String photo;
    // duration
    @NotNull
    private Integer duration;
    // stars
    @NotNull
    private Integer stars;
    @NotNull
    private String description;
    @NotNull
    private String preparation;

}
