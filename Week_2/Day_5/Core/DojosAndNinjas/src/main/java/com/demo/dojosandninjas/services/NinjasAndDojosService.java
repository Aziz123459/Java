package com.demo.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dojosandninjas.models.DojosModel;
import com.demo.dojosandninjas.models.NinjasModel;
import com.demo.dojosandninjas.repositories.DojosRepository;
import com.demo.dojosandninjas.repositories.NinjasRepository;

@Service
public class NinjasAndDojosService {
@Autowired
NinjasRepository ninjasRepo;
@Autowired
DojosRepository dojosRepo;

public List<NinjasModel> getAll(){
	return ninjasRepo.findAll();
}
public NinjasModel create(NinjasModel ninjas) {
	return ninjasRepo.save(ninjas);
}
public NinjasModel findNinById(Long id) {
	Optional<NinjasModel> Nin = ninjasRepo.findById(id);
	if(Nin.isPresent()) {
		return Nin.get();
	}else {
		return null;
	}
}
public List<DojosModel> allDojos(){
	return dojosRepo.findAll();
}

// CREATE
public DojosModel createDojo(DojosModel d) {
	return dojosRepo.save(d);
}


// READ ONE
public DojosModel findDojoById(Long id) {
	Optional<DojosModel> Dojo = dojosRepo.findById(id);
	if(Dojo.isPresent()) {
		return Dojo.get();
	}else {
		return null;
	}
}
}
