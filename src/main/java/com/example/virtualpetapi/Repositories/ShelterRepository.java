package com.example.virtualpetapi.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.virtualpetapi.Models.Shelter;

public interface ShelterRepository extends CrudRepository<Shelter, Long> {
    List<Shelter> findByName(String name);
    List<Shelter> findByOrgDogs_Name(String orgDogName);
    List<Shelter> findByOrgCats_Name(String orgCatName);
    List<Shelter> findByRoboDogs_Name(String roboDogName);
    List<Shelter> findByRoboCats_Name(String roboCatName);
    List<Shelter> findByVolunteers_Name(String volunteerName);
}
