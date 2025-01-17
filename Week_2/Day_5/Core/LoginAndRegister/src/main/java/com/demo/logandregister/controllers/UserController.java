package com.demo.logandregister.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.logandregister.models.LoginUser;
import com.demo.logandregister.models.User;
import com.demo.logandregister.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class UserController {
@Autowired
UserService userService;
@GetMapping("/")
public String index (Model model) {
	model.addAttribute("newLogin",new LoginUser());
	model.addAttribute("newUser",new User());
	return "index.jsp";
}
@PostMapping("/register")
public String register(@Valid @ModelAttribute("newUser")User newUser,BindingResult result,HttpSession session,Model model) {
	User user =userService.register(newUser, result);
	if(result.hasErrors()) {
		model.addAttribute("newLogin",new LoginUser());
		return "index.jsp";
	}
	session.setAttribute("userId",newUser.getId());
	return"redirect:/home";
}
@GetMapping("/home")
public String home(Model model,HttpSession session) {
	User user =userService.findById((Long)session.getAttribute("userId"));
	model.addAttribute("user",user);
	return "home.jsp";
}
@PostMapping("/login")
public String login(@Valid @ModelAttribute("newLogin")LoginUser newLogin,BindingResult result,HttpSession session,Model model) {
	User user=userService.login(newLogin, result);
	if(result.hasErrors()) {
		model.addAttribute("newUser", new User());
		return "index.jsp";
	}
	session.setAttribute("userId", user.getId());
	return"redirect:/home";
}
//Logout 
@GetMapping("/logout")
public String logout(HttpSession session) {
    //clear session
    session.invalidate();
    //redirect
    return "redirect:/";
}
}

