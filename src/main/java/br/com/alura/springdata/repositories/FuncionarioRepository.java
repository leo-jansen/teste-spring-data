package br.com.alura.springdata.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.alura.springdata.entities.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer>{
  List<Funcionario> findByNome(String nome); //Derived Query [https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation]
}
