package com.example.virtualpetapi.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.virtualpetapi.Models.RoboticCat;

public interface RoboticCatRepository extends CrudRepository<RoboticCat, Long>{
    List<RoboticCat> findByName(String name);
}
