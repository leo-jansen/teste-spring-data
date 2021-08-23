package br.com.alura.springdata.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cargos")
public class Cargo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String descricao;
  
  public Cargo() {
  }

  public Cargo(String descricao) {
    this.descricao = descricao;
  }
  
  public Cargo(Integer id, String descricao) {
    this.id = id;
    this.descricao = descricao;
  }

  public Integer getId() {
    return id;
  }

  public String getDescricao() {
    return descricao;
  }

  @Override
  public String toString() {
    return String.format("Descrição do cargo: %s", this.descricao);
  }
}
