package com.example.virtualpetapi.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrganicDog extends SuperAnimal {

    @ManyToOne
    @JoinColumn(name = "shelter_id")
    private Shelter shelter;

    private int boredom = 0;
    private int cleanlinessLevel = 100;
    private int hunger = 0;
    private int thirst = 0;
    private boolean walked = false;
    private boolean cageCleaned = false;

    public OrganicDog() {
    }

    public OrganicDog(String name, String description) {
        super(name, false, description, 100, 100);
        this.boredom = 0;
        this.cleanlinessLevel = 100;
    }

    public OrganicDog(String name, String description, int initialBoredom, int initialCleanliness, int initialHealth,
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

    public boolean isWalked() {
        return walked;
    }

    public boolean isCageCleaned() {
        return cageCleaned;
    }

    public void walk() {
        walked = true;
        boredom -= 20;
        if (boredom <= 0) {
            boredom = 0;
        }
        happiness += 20;
        if (happiness >= 100) {
            happiness = 100;
        }
        cleanlinessLevel += 20;
        if (cleanlinessLevel >= 100) {
            cleanlinessLevel = 100;
        }
    }

    public void cleanCage() {
        cageCleaned = true;
        cleanlinessLevel = 100;

        health += 10;
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
        return "OrganicDog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", robotic=" + robotic +
                ", description='" + description + '\'' +
                ", health=" + health +
                ", happiness=" + happiness +
                ", boredom=" + boredom +
                ", cleanlinessLevel=" + cleanlinessLevel +
                ", hunger=" + hunger +
                ", thirst=" + thirst +
                ", walked=" + walked +
                ", cageCleaned=" + cageCleaned +
                '}';
    }

}
