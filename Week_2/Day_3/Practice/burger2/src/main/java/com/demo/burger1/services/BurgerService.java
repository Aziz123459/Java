package com.demo.burger1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.burger1.Repositories.BurgerRepository;
import com.demo.burger1.model.BurgerModel;

@Service
public class BurgerService {
	@Autowired
	BurgerRepository burgerRepo;
	
	public List<BurgerModel> getAllBurgers(){
		return burgerRepo.findAll();
	}
	
	public BurgerModel createBurger(BurgerModel burger) {
		return burgerRepo.save(burger);
	}
	
	public BurgerModel updateBurger(Long id,BurgerModel newBurger) {
		newBurger.setId(id);
		return burgerRepo.save(newBurger);
		
	}
	public BurgerModel getBurgerById(Long id) {
		Optional<BurgerModel> todo = burgerRepo.findById(id);
		if(todo.isEmpty()) {
			return null;
		} else {
			return todo.get();
		}
		
	}
}
