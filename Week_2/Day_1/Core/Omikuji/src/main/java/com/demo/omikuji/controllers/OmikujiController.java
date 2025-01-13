package com.demo.omikuji.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
@Controller
public class OmikujiController {
@GetMapping("/")
public String form() {
	return "form.jsp";
}
@PostMapping("/apply")
public String handleForm(@RequestParam("num") int num,
		@RequestParam("city")String city,
		@RequestParam("person")String person,
		@RequestParam("hobby")String hobby,
		@RequestParam("thing")String thing,
		@RequestParam("smth")String smth,
		HttpSession session) {
	session.setAttribute("num", num);
	session.setAttribute("city", city);
	session.setAttribute("person", person);
	session.setAttribute("hobby", hobby);
	session.setAttribute("thing", thing);
	session.setAttribute("smth", smth);
	
	return "redirect:/display";
}
@GetMapping("/display")
	public String display() {
		return "display.jsp";
	}
}

