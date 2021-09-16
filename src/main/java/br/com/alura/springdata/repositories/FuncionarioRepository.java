package br.com.alura.springdata.repositories;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.alura.springdata.dto.FuncionarioTO;
import br.com.alura.springdata.entities.Funcionario;

public interface FuncionarioRepository extends CrudRepository<Funcionario, Integer>{
  List<Funcionario> findByNome(String nome); //Derived Query [https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation]
  // List<Funcionario> findByNameAndSalarioGreaterThanAndDataContratacao(String nome, BigDecimal salario, LocalDate data);
  /** Derived Query */
  List<Funcionario> findByCargoDescricao(String descricao);
  
  /** JPQL */
  @Query("SELECT f FROM Funcionario f WHERE f.nome = :nome AND f.salario >= :salario AND f.dataContratacao = :data")
  List<Funcionario> buscarNomeSalarioMaiorDataContratacao(String nome, BigDecimal salario, LocalDate data);
  
  /*@Query("SELECT f FROM Funcionario f JOIN f.cargo c WHERE c.descricao = :descricao")
  List<Funcionario> buscarCargoPelaDescricao(String descricao);*/
  
  /** Native Query */
  @Query(value = "SELECT * FROM funcionarios f WHERE f.data_contratacao >= :data", nativeQuery = true)
  List<Funcionario> buscarDataContratacaoMaior(LocalDate data);

  // usando objetoTO para projeção
  @Query("SELECT new br.com.alura.springdata.dto.FuncionarioTO(f.id, f.nome, f.salario) FROM Funcionario f")
  List<FuncionarioTO> buscarFuncionarioSalario();
}
