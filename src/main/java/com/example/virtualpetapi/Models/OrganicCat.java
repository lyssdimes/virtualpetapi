package com.example.virtualpetapi.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrganicCat extends SuperAnimal {

    @ManyToOne
    @JoinColumn(name = "shelter_id")
    private Shelter shelter;

    private int boredom = 0;
    private int cleanlinessLevel = 100;
    private int hunger = 0;
    private int thirst = 0;
    private boolean litterBoxCleaned = false;

    public boolean isLitterBoxCleaned() {
        return litterBoxCleaned;
    }

    public OrganicCat() {
    }

    public OrganicCat(String name, String description) {
        super(name, false, description, 100, 100);
        this.boredom = 0;
        this.cleanlinessLevel = 100;
    }

    public OrganicCat(String name, String description, int initialBoredom, int initialCleanliness, int initialHealth,
            int initialHappiness, int initialHunger, int initialThirst) {
        super(name, false, description, 100, 100);
        this.boredom = initialBoredom;
        this.cleanlinessLevel = initialCleanliness;
        this.health = initialHealth;
        this.happiness = initialHappiness;
        this.hunger = initialHunger;
        this.thirst = initialThirst;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void cuddle() {
        boredom -= 20;
        if (boredom <= 0) {
            boredom = 0;
        }
        happiness += 20;
        if (happiness >= 100) {
            happiness = 100;
        }
    }

    public void cleanLitterBox() {
        litterBoxCleaned = true;
        cleanlinessLevel = 100;
        health += 20;
        if (health >= 100) {
            health = 100;
        }
    }

    @Override
    public void feedOrOil() {
        hunger -= 20;
        if (hunger <= 0) {
            hunger = 0;
        }
        health += 20;
        if (health >= 100) {
            health = 100;
        }
        happiness += 20;
        if (happiness >= 100) {
            happiness = 100;
        }
    }

    @Override
    public void drinkOrMaintenance() {
        thirst -= 20;
        if (thirst <= 0) {
            thirst = 0;
        }
        health += 20;
        if (health >= 100) {
            health = 100;
        }
        happiness += 20;
        if (happiness >= 100) {
            happiness = 100;
        }
    }

    @Override
    public void decreaseHealth() {
        if (cleanlinessLevel <= 50 || hunger >= 50 || thirst >= 50 || boredom >= 50) {
            health -= 10;
            if (health <= 0) {
                health = 0;
            }
        }
    }

    @Override
    public void increaseHappiness() {
        if (cleanlinessLevel >= 50 && hunger <= 50 && thirst <= 50 && boredom <= 50) {
            happiness += 30;
            if (happiness >= 100) {
                happiness = 100;
            }
        }
    }

    @Override
    public String toString() {
        return "OrganicCat [id=" + id +
                ", name=" + name +
                ", boredom=" + boredom +
                ", cleanlinessLevel=" + cleanlinessLevel +
                ", hunger=" + hunger +
                ", thirst=" + thirst +
                ", litterBoxCleaned=" + litterBoxCleaned +
                "]";
    }

}
