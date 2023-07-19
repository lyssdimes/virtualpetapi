package com.example.virtualpetapi.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class SuperAnimal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String name;
    protected boolean robotic;
    protected String description;
    protected int health;
    protected int happiness;

    public SuperAnimal() {
    }

    public SuperAnimal(String name, boolean robotic, String description, int health, int happiness) {
        this.name = name;
        this.robotic = robotic;
        this.description = description;
        this.health = health;
        this.happiness = happiness;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isRobotic() {
        return robotic;
    }

    public String getDescription() {
        return description;
    }

    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }

    public abstract void feedOrOil();

    public abstract void drinkOrMaintenance();

    public abstract void decreaseHealth();

    public abstract void increaseHappiness();
}

