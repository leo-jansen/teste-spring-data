package br.com.alura.springdata.specifications;

import java.math.BigDecimal;

import org.springframework.data.jpa.domain.Specification;

import br.com.alura.springdata.entities.Funcionario;

public class FuncionarioSpecification {
  public static Specification<Funcionario> nome(String nome) {
    return (root, criteriaQuery,criteriaBuilder) -> 
      criteriaBuilder.like(root.get("nome"), "%" + nome + "%");
  }

  public static Specification<Funcionario> cpf(String cpf) {
    return (root, criteriaQuery,criteriaBuilder) -> 
      criteriaBuilder.equal(root.get("cpf"), cpf);
  }

  public static Specification<Funcionario> salario(BigDecimal salario) {
    return (root, criteriaQuery,criteriaBuilder) -> 
      criteriaBuilder.greaterThan(root.get("salario"), salario);
  }

}
