package br.com.alura.springdata.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "funcionarios")
public class Funcionario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String nome;
  private String cpf;
  private BigDecimal salario;
  @Column(name = "data_contratacao")
  private LocalDate dataContratacao;
  @ManyToOne(fetch = FetchType.LAZY)
  private Cargo cargo;
  @ManyToMany
  private List<Unidade> unidades;

  public Funcionario() {}

  public Funcionario(String nome, String cpf, BigDecimal salario) {
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
    this.dataContratacao = LocalDate.now();
  }

  public Funcionario(String nome, String cpf, BigDecimal salario, Cargo cargo) {
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
    this.dataContratacao = LocalDate.now();
    this.cargo = cargo;
  }

  public Funcionario(Integer id, String nome, String cpf, BigDecimal salario) {
    this.id = id;
    this.nome = nome;
    this.cpf = cpf;
    this.salario = salario;
    this.dataContratacao = LocalDate.now();
  }

  @Override
  public String toString() {
    return String.format("Nome: %s | CPF: %s | Salario: %.2f | Data da contratação: %s", this.nome, this.cpf, this.salario, this.dataContratacao.toString());
  }
}
