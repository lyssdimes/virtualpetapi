package com.example.virtualpetapi.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.virtualpetapi.Models.RoboticDog;

public interface RoboticDogRepository extends CrudRepository<RoboticDog, Long>{
    List<RoboticDog> findByName(String name);
}

