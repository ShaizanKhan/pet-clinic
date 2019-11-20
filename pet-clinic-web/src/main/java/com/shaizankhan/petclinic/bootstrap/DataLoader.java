package com.shaizankhan.petclinic.bootstrap;

import com.shaizankhan.petclinic.model.Owner;
import com.shaizankhan.petclinic.model.Vet;
import com.shaizankhan.petclinic.services.OwnerService;
import com.shaizankhan.petclinic.services.VetService;
import com.shaizankhan.petclinic.services.map.OwnerServiceMap;
import com.shaizankhan.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Shaizan.Khan
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Novak");
        owner1.setLastName("Djokovic");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Roger");
        owner2.setLastName("Federer");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Michel");
        vet2.setLastName("Albertan");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
