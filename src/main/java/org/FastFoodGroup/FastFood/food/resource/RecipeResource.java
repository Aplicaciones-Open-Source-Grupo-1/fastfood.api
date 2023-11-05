package org.FastFoodGroup.FastFood.food.resource;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class RecipeResource {
    private Integer id;
    private String name;
    private String photo;
    private Integer duration;
    private Integer stars;
    private String description;
    private String preparation;
}
