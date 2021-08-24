package br.com.alura.springdata.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.springdata.entities.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer>{
  
}
