package com.springframework.recipe.recipeapp.domains;

import javax.persistence.*;

/**
 * @author Ehtiram_Abdullayev on 07.12.2018
 * @project recipe-app
 */
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
