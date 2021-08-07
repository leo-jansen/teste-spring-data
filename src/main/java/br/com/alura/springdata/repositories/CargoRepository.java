package br.com.alura.springdata.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.springdata.entities.Cargo;

public interface CargoRepository extends CrudRepository<Cargo, Integer>{
  
}
