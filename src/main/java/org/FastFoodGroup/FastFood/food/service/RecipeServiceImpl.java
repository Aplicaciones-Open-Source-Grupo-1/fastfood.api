package org.FastFoodGroup.FastFood.food.service;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.FastFoodGroup.FastFood.food.domain.model.entity.Recipe;
import org.FastFoodGroup.FastFood.food.domain.persistance.RecipeRepository;
import org.FastFoodGroup.FastFood.food.domain.service.RecipeService;
import org.FastFoodGroup.FastFood.shared.exception.ResourceNotFoundException;
import org.FastFoodGroup.FastFood.shared.exception.ResourceValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * Service implementation for managing Recipe entities in the Fast Food application.
 * This class provides methods to perform various operations related to Recipe entities.
 *
 * @author Mauricio Oliveira Paucar
 * @author Sebastian Castro Soto
 * @author Jean Carlos Achamizo Huamani
 * @author Nicolás Zagal Vallejo
 * @since 1.0
 */
@Service
public class RecipeServiceImpl implements RecipeService {

    private static final String ENTITY = "Recipe";

    @Autowired
    private RecipeRepository recipeRepository;

    //@Autowired
    //private final Validator validator;

    /*public RecipeServiceImpl(RecipeRepository _recipeRepository, Validator _validator) {
        this.recipeRepository = _recipeRepository;
        this.validator = _validator;
    }*/

    /**
     * Constructor for RecipeServiceImpl.
     *
     * @param _recipeRepository The repository for Recipe entities
     */
    public RecipeServiceImpl(RecipeRepository _recipeRepository) {
        this.recipeRepository = _recipeRepository;
    }

    /**
     * Retrieves a list of all Recipe entities.
     *
     * @return List of all Recipe entities
     */
    @Override
    @Transactional(readOnly = true)
    public List<Recipe> fetchAll() {
        return recipeRepository.findAll();
    }

    /**
     * Retrieves a specific Recipe entity by its identifier.
     *
     * @param id The unique identifier of the Recipe
     * @return The Recipe entity with the specified ID, or null if not found
     */
    @Override
    public Recipe fetchByID(Integer id) {
        return null;
    }

    /**
     * Saves a new Recipe entity.
     *
     * @param recipe The Recipe entity to be saved
     * @return The saved Recipe entity
     * @throws ResourceValidationException If the validation of the Recipe fails
     */
    @Override
    public Recipe save(Recipe recipe) {
        // Set<ConstraintViolation<Recipe>> violations = validator.validate(recipe);
        // if(!violations.isEmpty()) {
        //     throw new ResourceValidationException(ENTITY, violations);
        // }
        return recipeRepository.save(recipe);
    }

    /**
     * Updates an existing Recipe entity.
     *
     * @param id     The unique identifier of the Recipe to be updated
     * @param recipe The updated Recipe entity
     * @return The updated Recipe entity
     * @throws ResourceValidationException If the validation of the Recipe fails
     */
    @Override
    public Recipe update(Integer id, Recipe recipe) {
        /*Set<ConstraintViolation<Recipe>> violations = validator.validate(recipe);
        if(!violations.isEmpty()) {
            throw new ResourceValidationException(ENTITY, violations);
        }
        return recipeRepository.save(recipe);*/
        return null;
    }

    /**
     * Deletes a Recipe entity by its identifier.
     *
     * @param id The unique identifier of the Recipe to be deleted
     * @return true if the deletion is successful, false otherwise
     * @throws ResourceNotFoundException If the specified ID is not found
     */
    @Override
    public boolean deleteById(Integer id) {
        var recipe = recipeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(ENTITY, id));
        recipeRepository.delete(recipe);
        return true;
    }
}
