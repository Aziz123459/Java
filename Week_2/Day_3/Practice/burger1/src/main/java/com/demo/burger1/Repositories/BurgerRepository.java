package com.demo.burger1.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.burger1.model.BurgerModel;

@Repository
public interface BurgerRepository extends CrudRepository<BurgerModel,Long>{
	List<BurgerModel> findAll();
}
