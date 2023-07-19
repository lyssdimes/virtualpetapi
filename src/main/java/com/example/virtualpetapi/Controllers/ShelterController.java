package com.example.virtualpetapi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.virtualpetapi.Models.Shelter;
import com.example.virtualpetapi.Repositories.ShelterRepository;

@RestController
@RequestMapping("/shelter")
public class ShelterController {
    @Autowired
    private ShelterRepository shelterRepository;

    @GetMapping("/{id}")
    public Shelter getShelterById(@PathVariable Long id) {
        return shelterRepository.findById(id).orElse(null);
    }

    @GetMapping("/name/{name}")
    public List<Shelter> getSheltersByName(@PathVariable String name) {
        return shelterRepository.findByName(name);
    }

    @GetMapping("/organicdogs/{name}")
    public List<Shelter> getSheltersByOrgDogName(@PathVariable String name) {
        return shelterRepository.findByOrgDogs_Name(name);
    }

    @GetMapping("/organiccats/{name}")
    public List<Shelter> getSheltersByOrgCatName(@PathVariable String name) {
        return shelterRepository.findByOrgCats_Name(name);
    }

    @GetMapping("/roboticdogs/{name}")
    public List<Shelter> getSheltersByRoboDogName(@PathVariable String name) {
        return shelterRepository.findByRoboDogs_Name(name);
    }

    @GetMapping("/roboticcats/{name}")
    public List<Shelter> getSheltersByRoboCatName(@PathVariable String name) {
        return shelterRepository.findByRoboCats_Name(name);
    }

    @GetMapping("/volunteers/{name}")
    public List<Shelter> getSheltersByVolunteerName(@PathVariable String name) {
        return shelterRepository.findByVolunteers_Name(name);
    }
}
