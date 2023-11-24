package org.FastFoodGroup.FastFood.food.domain.service;
import org.FastFoodGroup.FastFood.food.domain.model.entity.Recipe;
import java.util.List;
public interface RecipeService {
List<Recipe> fetchAll();
Recipe fetchByID(Integer id);
Recipe save(Recipe recipe);
Recipe update(Integer id,Recipe recipe);
boolean deleteById(Integer id);
}
