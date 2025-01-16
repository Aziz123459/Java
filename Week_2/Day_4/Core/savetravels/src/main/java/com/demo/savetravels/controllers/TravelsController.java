package com.demo.savetravels.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.demo.savetravels.models.TravelsModel;
import com.demo.savetravels.services.TravelsService;

import jakarta.validation.Valid;

@Controller
public class TravelsController {
    @Autowired
    TravelsService travelsService;

    @PostMapping("/expenses")
    public String CreateTravel(@Valid @ModelAttribute("travel") TravelsModel travel, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("travels", travelsService.getAllTravels());
            return "index.jsp";
        }
        travelsService.createTravel(travel);
        System.out.println("This is the model attribute: " + travel.getName());
        return "redirect:/expenses";
    }

    @GetMapping("/expenses")
    public String index(@ModelAttribute("travel") TravelsModel travel, Model model) {
        model.addAttribute("travels", travelsService.getAllTravels());
        return "index.jsp";
    }

    @GetMapping("/expense/edit/{id}")
    public String renderEditPage(@PathVariable("id") Long id, Model model) {
        TravelsModel travelToEdit = travelsService.getTravelById(id);
        if (travelToEdit == null) {
            return "redirect:/expenses"; // Handle invalid ID gracefully
        }
        model.addAttribute("travel", travelToEdit);
        return "edit.jsp";
    }

    @PutMapping("/expenses/edit/{id}")
    public String updateTravel(@Valid @ModelAttribute("travel") TravelsModel travel, BindingResult result, Model model, @PathVariable Long id) {
        if (result.hasErrors()) {
            return "edit.jsp";
        }
        travelsService.updateTravel(travel, id);
        return "redirect:/expenses";
    }

    @DeleteMapping("/expense/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        travelsService.deleteTravels(id);
        return "redirect:/expenses";
    }
    @GetMapping("/expense/{id}")
    public String findOneTravelById(@PathVariable("id") Long id, Model model) {
        TravelsModel selectedTravel = travelsService.findTravel(id);
        model.addAttribute("travel",selectedTravel);
        return "show.jsp";
    }
    
}

