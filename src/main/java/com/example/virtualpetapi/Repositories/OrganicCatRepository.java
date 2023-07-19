package com.example.virtualpetapi.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.virtualpetapi.Models.OrganicCat;

public interface OrganicCatRepository extends CrudRepository<OrganicCat, Long>{
    List<OrganicCat> findByName(String name);
}
