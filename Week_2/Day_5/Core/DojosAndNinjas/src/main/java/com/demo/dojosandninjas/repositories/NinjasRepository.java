package com.demo.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.dojosandninjas.models.NinjasModel;
@Repository
public interface NinjasRepository extends CrudRepository<NinjasModel,Long> {
	List<NinjasModel> findAll();

}
