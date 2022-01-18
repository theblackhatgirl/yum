package com.yum.recipe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Step {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    public Step(String description) {
        this.description = description;
    }

    public Step() {
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
