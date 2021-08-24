package br.com.alura.springdata.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.springdata.entities.Unidade;

public interface UnidadeRepository extends CrudRepository<Unidade, Integer>{
  
}
