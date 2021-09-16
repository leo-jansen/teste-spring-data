package br.com.alura.springdata.dto;

import java.math.BigDecimal;
/**
 * clase Data Transfer Object (DTO) ou Transfer Object (TO)
 * um DTO seria uma classe que provê exatamente aquilo que é necessário para um determinado processo.
 * e para manipulação do entity
 */
public class FuncionarioTO {
  private Integer id;
  private String nome;
  private BigDecimal salario;

  public FuncionarioTO(Integer id, String nome, BigDecimal salario) {
    this.id = id;
    this.nome = nome;
    this.salario = salario;
  }

  public Integer getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public BigDecimal getSalario() {
    return salario;
  }

  @Override
  public String toString() {
    return String.format("ID: %d | Nome: %s | Salario: %.2f", this.id,this.nome, this.salario);
  }
}
