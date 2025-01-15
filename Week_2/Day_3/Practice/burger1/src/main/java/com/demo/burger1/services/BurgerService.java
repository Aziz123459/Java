package com.demo.burger1.services;

import java.util.List;

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
}
