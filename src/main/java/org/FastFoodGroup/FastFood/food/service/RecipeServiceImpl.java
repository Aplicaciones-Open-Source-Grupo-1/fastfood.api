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

    public RecipeServiceImpl(RecipeRepository _recipeRepository) {
        this.recipeRepository = _recipeRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Recipe> fetchAll() {
        return recipeRepository.findAll();
    }

    @Override
    public Recipe fetchByID(Integer id) {
        return null;
    }

    @Override
    public Recipe save(Recipe recipe) {
       //Set<ConstraintViolation<Recipe>> violations = validator.validate(recipe);
        //if(!violations.isEmpty()) {
         //   throw new ResourceValidationException(ENTITY, violations);
        //}
        return recipeRepository.save(recipe);

    }

    @Override
    public Recipe update(Integer id, Recipe recipe) {
        /*Set<ConstraintViolation<Recipe>> violations = validator.validate(recipe);
        if(!violations.isEmpty()) {
            throw new ResourceValidationException(ENTITY, violations);
        }
        return recipeRepository.save(recipe);*/
        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        var recipe = recipeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(ENTITY,id));
        recipeRepository.delete(recipe);
        return true;
    }
}
