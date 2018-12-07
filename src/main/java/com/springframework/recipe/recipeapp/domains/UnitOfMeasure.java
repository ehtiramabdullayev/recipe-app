package com.springframework.recipe.recipeapp.domains;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * @author Ehtiram_Abdullayev on 07.12.2018
 * @project recipe-app
 */
@Entity
public class UnitOfMeasure {

    private String uom;

    @OneToOne
    private Ingredient ingredient;
}
