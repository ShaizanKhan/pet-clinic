package com.shaizankhan.petclinic.bootstrap;

import com.shaizankhan.petclinic.model.*;
import com.shaizankhan.petclinic.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * @author Shaizan.Khan
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialitiesService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
                      SpecialityService specialitiesService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialitiesService = specialitiesService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialitiesService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialitiesService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialitiesService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setFirstName("Novak");
        owner1.setLastName("Djokovic");
        owner1.setAddress("123 Novak Street");
        owner1.setCity("Miami");
        owner1.setTelephone("123456790");
        ownerService.save(owner1);

        Pet novaksPet = new Pet();
        novaksPet.setPetType(savedDogType);
        novaksPet.setOwner(owner1);
        novaksPet.setBirthDate(LocalDate.now());
        novaksPet.setName("Rocky");
        owner1.getPets().add(novaksPet);

        Owner owner2 = new Owner();
        owner2.setFirstName("Roger");
        owner2.setLastName("Federer");
        owner2.setAddress("123 Roger Street");
        owner2.setCity("Miami");
        owner2.setTelephone("123456790");

        Pet rogersCat = new Pet();
        rogersCat.setPetType(savedCatType);
        rogersCat.setOwner(owner2);
        rogersCat.setBirthDate(LocalDate.now());
        rogersCat.setName("Just Cat");
        owner2.getPets().add(rogersCat);

        ownerService.save(owner2);

        Visit catVisit = new Visit();
        catVisit.setPet(rogersCat);
        catVisit.setDate(LocalDate.now());
        catVisit.setDescription("Sneezy Kitty");

        visitService.save(catVisit);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);
        
        Vet vet2 = new Vet();
        vet2.setFirstName("Michel");
        vet2.setLastName("Albertan");
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
