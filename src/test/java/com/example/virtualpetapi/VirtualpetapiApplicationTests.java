package com.example.virtualpetapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.virtualpetapi.Controllers.OrganicCatController;
import com.example.virtualpetapi.Controllers.OrganicDogController;
import com.example.virtualpetapi.Controllers.RoboticCatController;
import com.example.virtualpetapi.Controllers.RoboticDogController;
import com.example.virtualpetapi.Controllers.ShelterController;
import com.example.virtualpetapi.Controllers.VolunteerController;
import com.example.virtualpetapi.Models.OrganicCat;
import com.example.virtualpetapi.Models.OrganicDog;
import com.example.virtualpetapi.Models.RoboticCat;
import com.example.virtualpetapi.Models.RoboticDog;
import com.example.virtualpetapi.Models.Shelter;
import com.example.virtualpetapi.Models.Volunteer;

@SpringBootTest
public class VirtualpetapiApplicationTests {

    @Autowired
    private OrganicCatController organicCatController;

    @Autowired
    private OrganicDogController organicDogController;

    @Autowired
    private RoboticCatController roboticCatController;

    @Autowired
    private RoboticDogController roboticDogController;

    @Autowired
    private ShelterController shelterController;

    @Autowired
    private VolunteerController volunteerController;

    @Test
    public void testGetOrganicCatById() {
        OrganicCat cat = new OrganicCat("Frosty", "Sassy white kitty", 0, 100, 0, 0, 0, 0);
        OrganicCat result = organicCatController.getOrganicCatById(1L);
        assertEquals(cat.getName(), "Frosty", "Wrong cat name");
        assertEquals(cat.getDescription(), result.getDescription(), "Not the right description");
    }

    @Test
    public void testGetOrganicDogById() {
        OrganicDog dog = new OrganicDog("Mocha", "Brown dog who likes caffeine", 0, 0, 0, 0, 0, 0);
        OrganicDog result = organicDogController.getOrganicDogById(1L);
        assertEquals(dog.getName(), "Mocha", "Wrong dog name");
        assertEquals(dog.getDescription(), result.getDescription(), "Not the right description");
    }

    @Test
    public void testGetRoboticCatById() {
        RoboticCat roboCat = new RoboticCat("Gizmo", "Little monster");
        RoboticCat result = roboticCatController.getRoboticCatById(1L);
        assertEquals(roboCat.getName(), "Gizmo", "Wrong robocat name");
        assertEquals(roboCat.getDescription(), result.getDescription(), "Not the right description");
    }

    @Test
    public void testGetRoboticDogById() {
        RoboticDog roboDog = new RoboticDog("Lemon", "Enjoys the scent of citrus wax", 0, 0, 0, 0);
        RoboticDog result = roboticDogController.getRoboticDogById(1L);
        assertEquals(roboDog.getName(), "Lemon", "Wrong robodog name");
        assertEquals(roboDog.getDescription(), result.getDescription(), "Not the right description");
    }

    @Test
    public void testGetShelterById() {
        Shelter result = shelterController.getShelterById(1L);
        assertEquals("Pawsome Pets", result.getName(), "No shelter with that name");
    }

    @Test
    public void testGetVolunteerByName() {
        Volunteer volunteer = new Volunteer("TJ");
        List<Volunteer> result = volunteerController.getVolunteersByName("TJ");
        List<Volunteer> expectedList = new ArrayList<>();
        expectedList.add(volunteer);
        assertEquals(expectedList.size(), result.size(), "Number of volunteers found different than expected");
        assertEquals("TJ", result.get(0).getName(), "No volunteer with that name");
    }
}
