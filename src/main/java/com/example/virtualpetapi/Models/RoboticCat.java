package com.example.virtualpetapi.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class RoboticCat extends SuperAnimal {

    @ManyToOne
    @JoinColumn(name = "shelter_id")
    private Shelter shelter;
    
    private int maintenance;
    private int oilLevel;
    private boolean oiled = false;

    public RoboticCat() {

    }

    public RoboticCat(String name, String description) {
        super(name, true, description, 100, 100);
        this.maintenance = 100;
        this.oilLevel = 100;
    }

    public RoboticCat(String name, String description, int initialHealth, int initialHappiness, int initialMaintenance,
            int initialOilLevel) {
        super(name, true, description, 100, 100);
        this.health = initialHealth;
        this.happiness = initialHappiness;
        this.maintenance = initialMaintenance;
        this.oilLevel = initialOilLevel;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public boolean isOiled() {
        return oiled;
    }

    @Override
    public void feedOrOil() {
        oiled = true;
        oilLevel = 100;
        happiness += 20;
        if (happiness >= 100) {
            happiness = 100;
        }
    }

    @Override
    public void drinkOrMaintenance() {
        maintenance = 100;
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
        if (oilLevel <= 50 || maintenance <= 50 || happiness <= 50) {
            health -= 10;
            if (health <= 0) {
                health = 0;
            }
        } else {
            health += 20;
        }
    }

    @Override
    public void increaseHappiness() {
        if (oilLevel >= 50 && maintenance >= 50) {
            happiness += 30;
            if (happiness >= 100) {
                happiness = 100;
            }
        }
    }

    @Override
    public String toString() {
        return "RoboticCat [id=" + id +
                ", name=" + name +
                ", maintenance=" + maintenance +
                ", oilLevel=" + oilLevel +
                ", oiled=" + oiled +
                "]";
    }

}