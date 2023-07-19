package com.example.virtualpetapi.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.virtualpetapi.Models.OrganicDog;

public interface OrganicDogRepository extends CrudRepository<OrganicDog, Long>{
    List<OrganicDog> findByName(String name);
}
