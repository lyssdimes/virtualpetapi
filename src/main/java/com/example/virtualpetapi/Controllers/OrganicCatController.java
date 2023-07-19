package com.example.virtualpetapi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.virtualpetapi.Models.OrganicCat;
import com.example.virtualpetapi.Repositories.OrganicCatRepository;

@RestController
@RequestMapping("/organiccats")
public class OrganicCatController {

    @Autowired
    private OrganicCatRepository organicCatRepository;

    @GetMapping("/{id}")
    public OrganicCat getOrganicCatById(@PathVariable Long id) {
        return organicCatRepository.findById(id).orElse(null);
    }

    @GetMapping("/name/{name}")
    public List<OrganicCat> getOrganicCatsByName(@PathVariable String name) {
        return organicCatRepository.findByName(name);
    }

}
