package com.yum.recipe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String amount;
    private String description;

    public Ingredient(String amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public Ingredient() {
    }

    public Long getId() {
        return id;
    }

    public String getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }
}
