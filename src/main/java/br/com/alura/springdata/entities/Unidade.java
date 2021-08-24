package br.com.alura.springdata.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "unidades")
public class Unidade {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String descricao;
  private String endereco;
  @ManyToMany(mappedBy = "unidades", fetch = FetchType.EAGER)
  private List<Funcionario> funcionarios;

  public Unidade() {}

  public Unidade(String descricao, String endereco) {
    this.descricao = descricao;
    this.endereco = endereco;
  }

  public Unidade(Integer id, String descricao, String endereco) {
    this.id = id;
    this.descricao = descricao;
    this.endereco = endereco;
  }

  @Override
  public String toString() {
    return String.format("Endereço: %s | Unidade: %s", this.descricao, this.endereco);
  }
}