package com.demo.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.savetravels.models.TravelsModel;

@Repository
public interface TravelsRepository extends CrudRepository<TravelsModel,Long> {
List<TravelsModel> findAll();
}
