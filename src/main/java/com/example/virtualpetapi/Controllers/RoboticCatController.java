package com.example.virtualpetapi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.virtualpetapi.Models.RoboticCat;
import com.example.virtualpetapi.Repositories.RoboticCatRepository;

@RestController
@RequestMapping("/roboticcats")
public class RoboticCatController {

    @Autowired
    private RoboticCatRepository roboticCatRepository;

    @GetMapping("/{id}")
    public RoboticCat getRoboticCatById(@PathVariable Long id) {
        return roboticCatRepository.findById(id).orElse(null);
    }

    @GetMapping("/name/{name}")
    public List<RoboticCat> getRoboticCatsByName(@PathVariable String name) {
        return roboticCatRepository.findByName(name);
    }

}