package com.example.virtualpetapi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.virtualpetapi.Models.RoboticDog;
import com.example.virtualpetapi.Repositories.RoboticDogRepository;

@RestController
@RequestMapping("/roboticdogs")
public class RoboticDogController {

    @Autowired
    private RoboticDogRepository roboticDogRepository;

    @GetMapping("/{id}")
    public RoboticDog getRoboticDogById(@PathVariable Long id) {
        return roboticDogRepository.findById(id).orElse(null);
    }

    @GetMapping("/name/{name}")
    public List<RoboticDog> getRoboticDogsByName(@PathVariable String name) {
        return roboticDogRepository.findByName(name);
    }

}
