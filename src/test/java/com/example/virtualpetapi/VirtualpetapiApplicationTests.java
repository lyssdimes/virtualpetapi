// package com.example.virtualpetapi;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import java.util.ArrayList;
// import java.util.List;

// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;

// import com.example.virtualpetapi.Controllers.OrganicCatController;
// import com.example.virtualpetapi.Controllers.OrganicDogController;
// import com.example.virtualpetapi.Controllers.RoboticCatController;
// import com.example.virtualpetapi.Controllers.RoboticDogController;
// import com.example.virtualpetapi.Controllers.ShelterController;
// import com.example.virtualpetapi.Controllers.VolunteerController;
// import com.example.virtualpetapi.Models.OrganicCat;
// import com.example.virtualpetapi.Models.OrganicDog;
// import com.example.virtualpetapi.Models.RoboticCat;
// import com.example.virtualpetapi.Models.RoboticDog;
// import com.example.virtualpetapi.Models.Shelter;
// import com.example.virtualpetapi.Models.Volunteer;

// @SpringBootTest
// public class VirtualpetapiApplicationTests {

//     @Autowired
//     private OrganicCatController organicCatController;

//     @Autowired
//     private OrganicDogController organicDogController;

//     @Autowired
//     private RoboticCatController roboticCatController;

//     @Autowired
//     private RoboticDogController roboticDogController;

//     @Autowired
//     private ShelterController shelterController;

//     @Autowired
//     private VolunteerController volunteerController;

//     @Test
//     public void testGetOrganicCatById() {
//         OrganicCat cat = new OrganicCat("Cat10", "Description");
//         OrganicCat result = organicCatController.getOrganicCatById(10L);
//         assertEquals(cat, result, "Did not find the expected OrganicCat");
//     }

//     @Test
//     public void testGetOrganicDogById() {
//         OrganicDog dog = new OrganicDog("Dog1", "Description");
//         OrganicDog result = organicDogController.getOrganicDogById(1L);
//         assertEquals(dog, result, "Did not find the expected OrganicDog");
//     }

//     @Test
//     public void testGetRoboticCatById() {
//         RoboticCat cat = new RoboticCat("Gizmo", "Description");
//         RoboticCat result = roboticCatController.getRoboticCatById(1L);
//         assertEquals(cat, result, "Did not find the expected RoboticCat");
//     }

//     @Test
//     public void testGetRoboticDogById() {
//         RoboticDog dog = new RoboticDog("RoboDog", "Description");
//         RoboticDog result = roboticDogController.getRoboticDogById(1L);
//         assertEquals(dog, result, "Did not find that RoboticDog");
//     }

//     @Test
//     public void testGetShelterById() {
//         Shelter result = shelterController.getShelterById(1L);
//         assertEquals("Shelter1", result.getName(), "No shelter with that name");
//     }

//     @Test
//     public void testGetVolunteerByName() {
//         Volunteer volunteer = new Volunteer("TJ");
//         List<Volunteer> result = volunteerController.getVolunteersByName("TJ");
//         List<Volunteer> expectedList = new ArrayList<>();
//         expectedList.add(volunteer);
//         assertEquals(expectedList.size(), result.size(), "Number of volunteers found different than expected");
//         assertEquals("TJ", result.get(0).getName(), "No volunteer found with that name");
//     }
// }
