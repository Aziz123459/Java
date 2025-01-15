package com.demo.burger1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.burger1.model.BurgerModel;
import com.demo.burger1.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
	@Autowired
	BurgerService burgerService;
	
	@PostMapping("/")
	public String createBurger(@Valid @ModelAttribute("burger")BurgerModel burger,BindingResult result,Model model) {
		// if there is validation errors related to the model
		if(result.hasErrors()) {
			model.addAttribute("burgers",burgerService.getAllBurgers());
			return "index.jsp";
		}
		// if there is no error we will persist the data in the db and redirect to /todos
		burgerService.createBurger(burger);
		System.out.println("this is the model attribute "+burger.getName());
		return "redirect:/";
	}
	@GetMapping("/")
	public String index(Model model,@ModelAttribute("burger")BurgerModel burger) {
		model.addAttribute("burgers",burgerService.getAllBurgers());
		return "index.jsp";
	}
}
