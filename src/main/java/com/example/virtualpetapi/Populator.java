package com.example.virtualpetapi;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.virtualpetapi.Models.OrganicCat;
import com.example.virtualpetapi.Models.OrganicDog;
import com.example.virtualpetapi.Models.RoboticCat;
import com.example.virtualpetapi.Models.RoboticDog;
import com.example.virtualpetapi.Models.Shelter;
import com.example.virtualpetapi.Models.Volunteer;
import com.example.virtualpetapi.Repositories.OrganicCatRepository;
import com.example.virtualpetapi.Repositories.OrganicDogRepository;
import com.example.virtualpetapi.Repositories.RoboticCatRepository;
import com.example.virtualpetapi.Repositories.RoboticDogRepository;
import com.example.virtualpetapi.Repositories.ShelterRepository;
import com.example.virtualpetapi.Repositories.VolunteerRepository;

@Component
public class Populator implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(Populator.class);

    @Autowired
    private OrganicCatRepository organicCatRepository;

    @Autowired
    private OrganicDogRepository organicDogRepository;

    @Autowired
    private RoboticCatRepository roboticCatRepository;

    @Autowired
    private RoboticDogRepository roboticDogRepository;

    @Autowired
    private ShelterRepository shelterRepository;

    @Autowired
    private VolunteerRepository volunteerRepository;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Fetching the info...(haha)");

        OrganicCat cat1 = new OrganicCat("Frosty", "Sassy white kitty");
        organicCatRepository.save(cat1);
        logger.info("Saved organic cat: {}", cat1);

        OrganicCat cat2 = new OrganicCat("Casper", "Sneaky black kitty");
        organicCatRepository.save(cat2);
        logger.info("Saved organic cat: {}", cat2);

        OrganicCat cat3 = new OrganicCat("Rick", "Shenanigans spotted cat");
        organicCatRepository.save(cat3);
        logger.info("Saved organic cat: {}", cat3);

        OrganicCat cat4 = new OrganicCat("Morty", "Brown scaredy cat");
        organicCatRepository.save(cat4);
        logger.info("Saved organic cat: {}", cat4);

        OrganicCat cat5 = new OrganicCat("Summer", "Orange party cat");
        organicCatRepository.save(cat5);
        logger.info("Saved organic cat: {}", cat5);

        OrganicDog dog1 = new OrganicDog("Mocha", "Brown dog who likes caffeine");
        organicDogRepository.save(dog1);
        logger.info("Saved organic dog: {}", dog1);

        OrganicDog dog2 = new OrganicDog("Frisbee", "Golden retriever who likes frisbees");
        organicDogRepository.save(dog2);
        logger.info("Saved organic dog: {}", dog2);

        OrganicDog dog3 = new OrganicDog("Jerry", "Nice. Reaaaaal nice.");
        organicDogRepository.save(dog3);
        logger.info("Saved organic dog: {}", dog3);

        RoboticCat roboCat1 = new RoboticCat("Gizmo", "Little monster");
        roboticCatRepository.save(roboCat1);
        logger.info("Saved robotic cat: {}", roboCat1);

        RoboticCat roboCat2 = new RoboticCat("Hopscotch", "Active robo kitty");
        roboticCatRepository.save(roboCat2);
        logger.info("Saved robotic cat: {}", roboCat2);

        RoboticDog roboDog1 = new RoboticDog("Lemon", "Enjoys the scent of citrus wax");
        roboticDogRepository.save(roboDog1);
        logger.info("Saved robotic dog: {}", roboDog1);

        RoboticDog roboDog2 = new RoboticDog("Sprinkles", "Funfetti colored doggo");
        roboticDogRepository.save(roboDog2);
        logger.info("Saved robotic dog: {}", roboDog2);

        Shelter shelter1 = new Shelter("Pawsome Pets");
        shelterRepository.save(shelter1);
        logger.info("Saved shelter: {}", shelter1);

        Shelter shelter2 = new Shelter("Blips and Chitz");
        shelterRepository.save(shelter2);
        logger.info("Saved shelter: {}", shelter2);

        Shelter shelter3 = new Shelter("Pet Time");
        shelterRepository.save(shelter3);
        logger.info("Saved shelter: {}", shelter3);

        Shelter shelter4 = new Shelter("Pets R Us");
        shelterRepository.save(shelter4);
        logger.info("Saved shelter: {}", shelter4);

        Volunteer volunteer1 = new Volunteer("TJ");
        volunteerRepository.save(volunteer1);
        logger.info("Saved volunteer: {}", volunteer1);

        Volunteer volunteer2 = new Volunteer("Alex");
        volunteerRepository.save(volunteer2);
        logger.info("Saved volunteer: {}", volunteer2);

        Volunteer volunteer3 = new Volunteer("Ian");
        volunteerRepository.save(volunteer3);
        logger.info("Saved volunteer: {}", volunteer3);

        Volunteer volunteer4 = new Volunteer("Ally");
        volunteerRepository.save(volunteer4);
        logger.info("Saved volunteer: {}", volunteer4);

        Volunteer volunteer5 = new Volunteer("Maria");
        volunteerRepository.save(volunteer5);
        logger.info("Saved volunteer: {}", volunteer5);

        Volunteer volunteer6 = new Volunteer("John");
        volunteerRepository.save(volunteer6);
        logger.info("Saved volunteer: {}", volunteer6);

        Volunteer volunteer7 = new Volunteer("Jessie");
        volunteerRepository.save(volunteer7);
        logger.info("Saved volunteer: {}", volunteer7);

        Volunteer volunteer8 = new Volunteer("James");
        volunteerRepository.save(volunteer8);
        logger.info("Saved volunteer: {}", volunteer8);

        Volunteer volunteer9 = new Volunteer("Tom");
        volunteerRepository.save(volunteer9);
        logger.info("Saved volunteer: {}", volunteer9);

        Volunteer volunteer10 = new Volunteer("Megan");
        volunteerRepository.save(volunteer10);
        logger.info("Saved volunteer: {}", volunteer10);

        shelter4.getOrgCats().add(cat1);
        shelter4.getOrgCats().add(cat2);
        shelter4.getRoboDogs().add(roboDog1);

        shelter3.getOrgCats().add(cat5);
        shelter3.getOrgDogs().add(dog1);
        shelter3.getOrgDogs().add(dog3);
        shelter3.getRoboCats().add(roboCat2);

        shelter1.getRoboCats().add(roboCat1);
        shelter1.getOrgDogs().add(dog2);
        shelter1.getRoboDogs().add(roboDog2);

        shelter2.getOrgCats().add(cat3);
        shelter2.getOrgCats().add(cat4);
        shelter2.getRoboDogs().add(roboDog1);

        shelterRepository.saveAll(Arrays.asList(shelter1, shelter2, shelter3, shelter4));

        volunteer1.getShelters().addAll(Arrays.asList(shelter1, shelter2, shelter3, shelter4));
        volunteer2.getShelters().addAll(Arrays.asList(shelter1, shelter2, shelter3, shelter4));
        volunteer3.getShelters().addAll(Arrays.asList(shelter1, shelter2, shelter3, shelter4));
        volunteer4.getShelters().addAll(Arrays.asList(shelter1, shelter2, shelter3, shelter4));
        volunteer5.getShelters().addAll(Arrays.asList(shelter1, shelter2, shelter3, shelter4));
        volunteer6.getShelters().addAll(Arrays.asList(shelter1, shelter2));
        volunteer7.getShelters().addAll(Arrays.asList(shelter1, shelter2));
        volunteer8.getShelters().addAll(Arrays.asList(shelter1, shelter2));
        volunteer9.getShelters().addAll(Arrays.asList(shelter3, shelter4));
        volunteer10.getShelters().addAll(Arrays.asList(shelter3, shelter4));

        volunteerRepository.saveAll(Arrays.asList(volunteer1, volunteer2, volunteer3, volunteer4, volunteer5,
                volunteer6, volunteer7, volunteer8, volunteer9, volunteer10));

        logger.info("Success!");
    }
}