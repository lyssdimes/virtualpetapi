package com.example.virtualpetapi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.virtualpetapi.Models.SuperAnimal;
import com.example.virtualpetapi.Repositories.SuperAnimalRepository;

@RestController
@RequestMapping("/superanimal")
public class SuperAnimalController {

    @Autowired
    private SuperAnimalRepository superAnimalRepository;

    @GetMapping("/{id}")
    public SuperAnimal getSuperAnimalById(@PathVariable Long id){
        return superAnimalRepository.findById(id).orElse(null);
    }
    
}
