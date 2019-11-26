package com.shaizankhan.petclinic.controllers;

import com.shaizankhan.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shaizan.Khan
 */
@Controller
public class VetsController {

    private VetService vetService;

    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets","/vets/index","/vets/index.html", "/vets.html"})
    public String getVetList(Model model){
        model.addAttribute("vets", vetService.findAll());
        return "/vets/index";
    }


}
