package com.example.virtualpetapi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.virtualpetapi.Models.OrganicDog;
import com.example.virtualpetapi.Repositories.OrganicDogRepository;

@RestController
@RequestMapping("/organicdogs")
public class OrganicDogController {

    @Autowired
    private OrganicDogRepository organicDogRepository;

    @GetMapping("/{id}")
    public OrganicDog getOrganicDogById(@PathVariable Long id) {
        return organicDogRepository.findById(id).orElse(null);
    }

    @GetMapping("/name/{name}")
    public List<OrganicDog> getOrganicDogsByName(@PathVariable String name) {
        return organicDogRepository.findByName(name);
    }

}
