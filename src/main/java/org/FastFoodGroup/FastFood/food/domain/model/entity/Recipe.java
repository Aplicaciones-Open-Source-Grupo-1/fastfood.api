package org.FastFoodGroup.FastFood.food.domain.model.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "name")
    private String name;

    @Column(name = "photo")
    private String photo;

    //duration in minutes
    @Column(name = "duration")
    private Integer duration;

    //stars from 1 to 5
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


    // description of the recipe
    @Column(name = "description")
    private String description;

    // preparation
    @Column(name = "preparation")
    private String preparation;


}
