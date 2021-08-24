package br.com.alura.springdata.services;

import org.springframework.stereotype.Service;

import br.com.alura.springdata.entities.Unidade;
import br.com.alura.springdata.repositories.UnidadeRepository;

@Service
public class UnidadeService {
  private final UnidadeRepository unidadeRepository;

  public UnidadeService(UnidadeRepository unidadeRepository) {
    this.unidadeRepository = unidadeRepository;
  }

  public void salvar(Unidade unidade) {
    // logica para salvar no banco de dados
    unidadeRepository.save(unidade);
  }

  public void atualizar(Integer id, String descricao, String endereco) {
    Unidade unidade = new Unidade(id, descricao, endereco);
    unidadeRepository.save(unidade);
  }

  public Iterable<Unidade> buscar() {
    Iterable<Unidade> unidades = unidadeRepository.findAll();
    return unidades;
  }

  public void deletarPorId(Integer id) {
    unidadeRepository.deleteById(id);
  }
}
