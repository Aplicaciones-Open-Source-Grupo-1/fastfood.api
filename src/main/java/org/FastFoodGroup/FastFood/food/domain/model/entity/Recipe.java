package org.FastFoodGroup.FastFood.food.domain.model.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

/**
 * Represents a recipe entity in the Fast Food application.
 * This class is part of the domain model.
 *
 * @author Mauricio Oliveira Paucar
 * @author Sebastian Castro Soto
 * @author Jean Carlos Achamizo Huamani
 * @author Nicolás Zagal Vallejo
 * @since 1.0
 */
@Setter
@Getter
@Entity
@Table(name = "recipes")
public class Recipe {

    /**
     * Unique identifier for the recipe.
     */
    @Schema(description = "Unique identifier for the recipe")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Name of the recipe.
     */
    @Schema(description = "Name of the recipe")
    @Column(name = "name")
    private String name;

    /**
     * URL or path to the photo of the recipe.
     */
    @Schema(description = "URL or path to the photo of the recipe")
    @Column(name = "photo")
    private String photo;

    /**
     * Duration of the recipe preparation in minutes.
     */
    @Schema(description = "Duration of the recipe preparation in minutes")
    @Column(name = "duration")
    private Integer duration;

    /**
     * Stars rating of the recipe (from 1 to 5).
     */
    @Schema(description = "Stars rating of the recipe (from 1 to 5)")
    @Column(name = "stars")
    private Integer stars;

    /*
    ingredients
    @Column(name = "ingredients")
    private String ingredients;

    idCreator
    @Column(name = "idCreator")
    private Integer idCreator;
     */

    /**
     * Description of the recipe.
     */
    @Schema(description = "Description of the recipe")
    @Column(name = "description")
    private String description;

    /**
     * Step-by-step preparation instructions.
     */
    @Schema(description = "Step-by-step preparation instructions")
    @Column(name = "preparation")
    private String preparation;
}
