package org.FastFoodGroup.FastFood.food.domain.persistance;

import org.FastFoodGroup.FastFood.food.domain.model.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

}
