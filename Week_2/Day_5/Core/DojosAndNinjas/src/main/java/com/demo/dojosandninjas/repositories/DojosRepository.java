package com.demo.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.dojosandninjas.models.DojosModel;
@Repository
public interface DojosRepository extends CrudRepository<DojosModel,Long>{
List<DojosModel> findAll();
List<DojosModel> findByNameContains(String name);
}
