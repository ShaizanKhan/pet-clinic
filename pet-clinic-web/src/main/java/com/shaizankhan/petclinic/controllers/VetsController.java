package com.shaizankhan.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shaizan.Khan
 */
@Controller
public class VetsController {
    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String getVetList(){
        return "/vets/index";
    }
}
