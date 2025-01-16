package com.demo.savetravels.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.savetravels.models.TravelsModel;
import com.demo.savetravels.repositories.TravelsRepository;

@Service
public class TravelsService {
	@Autowired
	TravelsRepository travelsRepo;
	public List<TravelsModel> getAllTravels(){
		return travelsRepo.findAll();
	}
	public TravelsModel createTravel(TravelsModel travel) {
		return travelsRepo.save(travel);
	}
	public TravelsModel updateTravel(TravelsModel travel, Long id) {
		travel.setId(id);
		return travelsRepo.save(travel);
	}
	public TravelsModel getTravelById(Long id) {
		Optional<TravelsModel> travel=travelsRepo.findById(id);
		if(travel.isEmpty()) {
			return null;
		}else {
			return travel.get();
		}
	}
	public void deleteTravels(Long id) {
		travelsRepo.deleteById(id);
		
	}
	  public TravelsModel findTravel(Long id) {
	        Optional<TravelsModel> optionalTravel = travelsRepo.findById(id);
	        if(optionalTravel.isPresent()) {
	            return optionalTravel.get();
	        } else {
	            return null;
	        }
	  }
}
