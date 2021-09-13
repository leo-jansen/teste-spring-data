package br.com.alura.springdata.services;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.alura.springdata.entities.Funcionario;
import br.com.alura.springdata.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {
  private final FuncionarioRepository funcionarioRepository;

  public FuncionarioService(FuncionarioRepository funcionarioRepository) {
    this.funcionarioRepository = funcionarioRepository;
  }

  public void salvar(Funcionario funcionario) {
    // logica para salvar no banco de dados
    funcionarioRepository.save(funcionario);
  }

  public void atualizar(Integer id, String nome, String cpf, BigDecimal salario) {
    Funcionario funcionario = new Funcionario(id, nome, cpf, salario);
    funcionarioRepository.save(funcionario);
  }

  public Iterable<Funcionario> buscar() {
    Iterable<Funcionario> funcionarios = funcionarioRepository.findAll();
    return funcionarios;
  }

  public void deletarPorId(Integer id) {
    funcionarioRepository.deleteById(id);
  }

  public List<Funcionario> buscarPorNome(String nome) {
    List<Funcionario> funcionarios = funcionarioRepository.findByNome(nome);
    return funcionarios;
  }

  public List<Funcionario> buscarNomeSalarioMaiorDataContratacao(String nome, BigDecimal salario, LocalDate data) {
    List<Funcionario> funcionarios = funcionarioRepository.buscarNomeSalarioMaiorDataContratacao(nome, salario, data);
    return funcionarios;
  }

}
