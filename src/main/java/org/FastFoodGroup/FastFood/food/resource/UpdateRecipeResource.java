package org.FastFoodGroup.FastFood.food.resource;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@With
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRecipeResource {
    @NotNull
    @NotBlank
    @Min(1)
    private Integer id;

    @NotNull
    @NotBlank
    private String name;

    //photo
    @NotNull
    @NotBlank
    private String photo;
    //duration
    @NotNull
    @NotBlank
    @Min(1)
    private Integer duration;

    //stars
    @NotNull
    @NotBlank
    @Min(1)
    @Max(5)
    private Integer stars;

    @NotNull
    @NotBlank
    private String description;

    @NotNull
    @NotBlank
    private String preparation;

}
