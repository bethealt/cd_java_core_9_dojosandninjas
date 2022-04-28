package com.bethealt.dojosandninjas.controllers;
import java.util.List;

import javax.validation.Valid;

import com.bethealt.dojosandninjas.models.*;
import com.bethealt.dojosandninjas.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class DojoController {

    @Autowired
    DojoService dojoService;
    
    @GetMapping("/")
    public String index() {
        return "redirect:/dojos";
    }

    @GetMapping("/dojos")
    public String dojos(@ModelAttribute("dojo") Dojo dojo, Model model) {
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("dojos", dojos);
        return "index.jsp";
    }

    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo, Model model) {
        return "dojo.jsp";
    }

    @GetMapping("/dojos/{id}")
    public String display(@PathVariable Long id, Model model) {
        Dojo displayDojo = dojoService.findDojo(id);
        model.addAttribute("dojo", displayDojo);
        return "display.jsp";
    }

    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninja") Ninja ninja,
        Model model) {
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("dojos", dojos);
        return "ninja.jsp";
    }

    @PostMapping("/dojos/new")
    public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result, Model model) {
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("dojos", dojos);
        if(result.hasErrors()) {
            return "dojo.jsp";
        }
        else {
            dojoService.createDojo(dojo);
            return "redirect:/";
        }
    }

    @PostMapping("ninjas/new")
    public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "ninja.jsp";
        }
        else {
            dojoService.createNinja(ninja);
            return "redirect:/";
        }
    }
    
}
