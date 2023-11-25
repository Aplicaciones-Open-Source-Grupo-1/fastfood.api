package org.FastFoodGroup.FastFood.food.rest;

import lombok.AllArgsConstructor;
import org.FastFoodGroup.FastFood.food.domain.model.entity.Recipe;
import org.FastFoodGroup.FastFood.food.domain.service.RecipeService;
import org.FastFoodGroup.FastFood.food.mapping.RecipeMapper;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Validator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Controller class for handling Recipe-related operations in the Fast Food application.
 * This class exposes RESTful endpoints for interacting with Recipe entities.
 *
 * @author Mauricio Oliveira Paucar
 * @author Sebastian Castro Soto
 * @author Jean Carlos Achamizo Huamani
 * @author Nicolás Zagal Vallejo
 * @since 1.0
 */
@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;
    // private Validator validator;

    private final RecipeMapper mapper;

    /**
     * Retrieves a list of all Recipe entities.
     *
     * @return List of all Recipe entities
     */
    @Transactional(readOnly = true)
    @GetMapping("/recipes")
    public List<Recipe> fetchAll() {
        return recipeService.fetchAll();
    }

    /**
     * Creates a new Recipe entity.
     *
     * @param recipe The Recipe entity to be created
     * @return ResponseEntity with the created Recipe and HTTP status code 201 (Created)
     */
    @Transactional
    @PostMapping("/recipes")
    public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe) {
        return new ResponseEntity<>(recipeService.save(recipe), HttpStatus.CREATED);
    }

    /**
     * Updates an existing Recipe entity.
     *
     * @param id     The unique identifier of the Recipe to be updated
     * @param recipe The updated Recipe entity
     * @return ResponseEntity with the updated Recipe and HTTP status code 200 (OK)
     */
    @Transactional
    @PutMapping("/recipes/{id}")
    public ResponseEntity<Recipe> updateRecipe(@PathVariable Integer id, @RequestBody Recipe recipe) {
        return new ResponseEntity<>(recipeService.update(id, recipe), HttpStatus.OK);
    }

    /**
     * Deletes a Recipe entity by its identifier.
     *
     * @param id The unique identifier of the Recipe to be deleted
     * @return ResponseEntity with HTTP status code 200 (OK) if deletion is successful,
     *         or HTTP status code 404 (Not Found) if the specified ID is not found
     */
    @Transactional
    @DeleteMapping("/recipes/{id}")
    public ResponseEntity<Recipe> deleteRecipe(@PathVariable Integer id) {
        if (recipeService.deleteById(id)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
