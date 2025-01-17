package com.demo.dojosandninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.dojosandninjas.models.DojosModel;
import com.demo.dojosandninjas.models.NinjasModel;
import com.demo.dojosandninjas.services.NinjasAndDojosService;

import jakarta.validation.Valid;



@Controller
public class NinjasAndDojosController {
	@Autowired
	NinjasAndDojosService dojoninjaServ;
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") DojosModel dojo) {
		return "dojo.jsp";
	}
	
	@PostMapping("/create/dojo")
	public String createDojo(@ModelAttribute("dojo") DojosModel dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "dojo.jsp";
		}
		dojoninjaServ.createDojo(dojo);
		return "redirect:/new";
	}
	
	@GetMapping("/dojo")
	public String getDojo(@PathVariable Long id,Model model) {
		model.addAttribute("dojo", model);
		return "show.jsp";
	}
	
	@GetMapping("/dojo/{id}")
	public String ninjaByDojo(@PathVariable Long id,Model model) {
		DojosModel saved = dojoninjaServ.findDojoById(id);
		System.out.println(saved);
		model.addAttribute("dojo", saved);
		return "show.jsp";
	}
	@GetMapping("/new")
	public String ninjaForm(@ModelAttribute("ninja") NinjasModel ninja, Model model) {
		List<DojosModel> allDojos = dojoninjaServ.allDojos();
		model.addAttribute("allDojos",allDojos);
		return "ninja.jsp";
	}
	@PostMapping("/createNinja")
	public String createNinja(@Valid @ModelAttribute("ninja") NinjasModel ninja,
			BindingResult result) {
		Number id=ninja.getDojo().getId();
		if (result.hasErrors()) {
			return "ninja.jsp";
		}else {
			dojoninjaServ.create(ninja);
			return "redirect:/dojo/"+id;
		}

	}
}
