package com.demo.logandregister.services;



import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.demo.logandregister.models.LoginUser;
import com.demo.logandregister.models.User;
import com.demo.logandregister.repositories.UserRepository;

@Service
public class UserService {
@Autowired
UserRepository userRepo;
public List<User> findAllUsers(){
	return userRepo.findAll();
}
public User findUserById(Long id) {
	Optional<User> u=userRepo.findById(id);
	if(u.isEmpty()) {
		return null;
	}
	return u.get();
}
public User findUserByEmail(String email){
	Optional<User> u=userRepo.findByEmail(email);
	if(u.isEmpty()) {
		return null;
	}
	return u.get();
}
public User register(User newUser,BindingResult result) {
	if(findUserByEmail(newUser.getEmail())!=null) {
		// adding error to result
		result.rejectValue("email", "unique", "email already in use !");
	}
	
	//we will check the password and confirm 
	if(!newUser.getPassword().equals(newUser.getConfirm())) {
		result.rejectValue("confirm", "not matching", "password does not match !");
	}
	
	//we will check the other validation 
	System.out.println(result.getAllErrors());
	if(result.hasErrors()) {
		return null;
	}
	
	//we will hash our password 
	String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
	// we will set the hashed password 
	newUser.setPassword(hashed);
	
	//persist the data
	return userRepo.save(newUser);
	
	
}


// Login Process 
public User login (LoginUser newLogin,BindingResult result) {
	// check the eamil existance 
	User user = findUserByEmail(newLogin.getEmail());
	if(user==null) {
		result.rejectValue("email", "WrongCredentials", "User does not exist with this email !");
	}
	
	if(result.hasErrors()) {
		return null;
	}
	if(!BCrypt.checkpw(newLogin.getPassword(),user.getPassword())) {
		result.rejectValue("password", "WrongCredentials", "Wrong Password !");
	}
	return user;
	
	
}

public User findById(Long id) {
	Optional<User> u = userRepo.findById(id);
	if(u.isPresent()) {
		return u.get();
	}
	return null;
}

}

