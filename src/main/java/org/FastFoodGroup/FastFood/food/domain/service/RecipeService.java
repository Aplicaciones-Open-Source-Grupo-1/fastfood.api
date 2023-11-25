package org.FastFoodGroup.FastFood.food.domain.service;

import org.FastFoodGroup.FastFood.food.domain.model.entity.Recipe;

import java.util.List;

/**
 * Service interface for managing Recipe entities in the Fast Food application.
 * Defines methods to perform various operations related to Recipe entities.
 *
 * @author Mauricio Oliveira Paucar
 * @author Sebastian Castro Soto
 * @author Jean Carlos Achamizo Huamani
 * @author Nicolás Zagal Vallejo
 * @since 1.0
 */
public interface RecipeService {

    /**
     * Retrieves all Recipe entities.
     *
     * @return List of all Recipe entities
     */
    List<Recipe> fetchAll();

    /**
     * Retrieves a specific Recipe entity by its identifier.
     *
     * @param id The unique identifier of the Recipe
     * @return The Recipe entity with the specified ID, or null if not found
     */
    Recipe fetchByID(Integer id);

    /**
     * Saves a new Recipe entity or updates an existing one.
     *
     * @param recipe The Recipe entity to be saved or updated
     * @return The saved or updated Recipe entity
     */
    Recipe save(Recipe recipe);

    /**
     * Updates an existing Recipe entity with the specified ID.
     *
     * @param id     The unique identifier of the Recipe to be updated
     * @param recipe The updated Recipe entity
     * @return The updated Recipe entity, or null if the specified ID is not found
     */
    Recipe update(Integer id, Recipe recipe);

    /**
     * Deletes a Recipe entity by its identifier.
     *
     * @param id The unique identifier of the Recipe to be deleted
     * @return true if the deletion is successful, false otherwise
     */
    boolean deleteById(Integer id);
}
