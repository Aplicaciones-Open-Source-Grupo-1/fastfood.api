package org.FastFoodGroup.FastFood.food.domain.persistance;

import org.FastFoodGroup.FastFood.food.domain.model.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for managing Recipe entities in the Fast Food application.
 * This interface extends JpaRepository to inherit CRUD (Create, Read, Update, Delete) operations
 * provided by Spring Data JPA.
 *
 * @author Mauricio Oliveira Paucar
 * @author Sebastian Castro Soto
 * @author Jean Carlos Achamizo Huamani
 * @author Nicolás Zagal Vallejo
 * @since 1.0
 */
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

}
