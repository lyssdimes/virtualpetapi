package com.example.virtualpetapi.Models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;


@Entity
public class Shelter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Shelter() {
    }

    public Shelter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    @OneToMany(mappedBy = "shelter")
    private List<OrganicDog> orgDogs;
    // private List<OrganicDog> orgDogs = new ArrayList<>();

    @OneToMany(mappedBy = "shelter")
    private List<OrganicCat> orgCats;
    

    // private List<OrganicCat> orgCats = new ArrayList<>();

    @OneToMany(mappedBy = "shelter")
    private List<RoboticDog> roboDogs;
    // private List<RoboticDog> roboDogs = new ArrayList<>();

    @OneToMany(mappedBy = "shelter")
    private List<RoboticCat> roboCats;
    // private List<RoboticCat> roboCats = new ArrayList<>();

    @ManyToMany(mappedBy = "shelters")
    private List<Volunteer> volunteers;
    // private List<Volunteer> volunteers = new ArrayList<>();

    public List<OrganicDog> getOrgDogs() {
        return orgDogs;
    }

    public List<OrganicCat> getOrgCats() {
        return orgCats;
    }

    public List<RoboticDog> getRoboDogs() {
        return roboDogs;
    }

    public List<RoboticCat> getRoboCats() {
        return roboCats;
    }

    public List<Volunteer> getVolunteers() {
        return volunteers;
    }

    @Override
    public String toString() {
        return "Shelter [id=" + id +
                ", name=" + name +
                ", orgDogs=" + (orgDogs != null ? orgDogs.size() : 0) +
                ", orgCats=" + (orgCats != null ? orgCats.size() : 0) +
                ", roboDogs=" + (roboDogs != null ? roboDogs.size() : 0) +
                ", roboCats=" + (roboCats != null ? roboCats.size() : 0) +
                ", volunteers=" + (volunteers != null ? volunteers.size() : 0) +
                "]";
    }

}
