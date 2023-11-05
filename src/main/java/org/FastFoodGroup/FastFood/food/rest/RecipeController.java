package org.FastFoodGroup.FastFood.food.rest;

import lombok.AllArgsConstructor;
import org.FastFoodGroup.FastFood.food.domain.model.entity.Recipe;
import org.FastFoodGroup.FastFood.food.domain.service.RecipeService;
import org.FastFoodGroup.FastFood.food.mapping.RecipeMapper;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Validator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
public class RecipeController {
    private final RecipeService recipeService;
    //private Validator validator;

    private final RecipeMapper mapper;
    // https://localhost:8080/api/v1/recipes

    @Transactional(readOnly = true)
    @GetMapping("/recipes")
    public List<Recipe> fetchAll() {
        return recipeService.fetchAll();
    }

    @Transactional
    @PostMapping("/recipes")
    public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe) {
        return new ResponseEntity<Recipe>(recipeService.save(recipe), HttpStatus.CREATED);
    }

    @Transactional
    @PutMapping("/recipes/{id}")
    public ResponseEntity<Recipe> updateRecipe(@PathVariable Integer id, @RequestBody Recipe recipe) {
        return new ResponseEntity<Recipe>(recipeService.update(id, recipe), HttpStatus.OK);
    }

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
