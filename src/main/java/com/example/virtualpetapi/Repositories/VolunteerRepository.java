package com.example.virtualpetapi.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.virtualpetapi.Models.Volunteer;

public interface VolunteerRepository extends CrudRepository<Volunteer, Long>{
    List<Volunteer> findByName(String name);
}

