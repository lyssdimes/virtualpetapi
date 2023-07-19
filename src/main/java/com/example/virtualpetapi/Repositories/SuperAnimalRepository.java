package com.example.virtualpetapi.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.virtualpetapi.Models.SuperAnimal;

public interface SuperAnimalRepository extends CrudRepository<SuperAnimal, Long>{
    
}

