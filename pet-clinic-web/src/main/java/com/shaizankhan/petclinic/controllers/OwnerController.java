package com.shaizankhan.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Shaizan.Khan
 */
@Controller
@RequestMapping("/owners")
public class OwnerController {
    @RequestMapping({"","/","/index","/index.html"})
    public String getOwnerList(){
        return "/owners/index";
    }
}
