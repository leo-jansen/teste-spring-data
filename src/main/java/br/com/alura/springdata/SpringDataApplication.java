package br.com.alura.springdata;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.springdata.entities.Funcionario;
import br.com.alura.springdata.entities.Cargo;
import br.com.alura.springdata.services.CargoService;
import br.com.alura.springdata.services.FuncionarioService;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {
  private final CargoService cargoService;
  private final FuncionarioService funcionarioService;

  SpringDataApplication(CargoService cargoService, FuncionarioService funcionarioService) {
    this.cargoService = cargoService;
    this.funcionarioService = funcionarioService;
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringDataApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    Cargo cargo = new Cargo("RH");
    cargoService.salvar(cargo);
    /*cargoService.atualizar(3, "Analista de dados");
    cargoService.buscar().forEach(System.out::println); // printa todos os cargos do BD
    cargoService.deletarPorId(1); */
    Funcionario funcionario = new Funcionario("Paulo Silveira", "111.111.111-11", new BigDecimal("25000"), cargo);
    funcionarioService.salvar(funcionario);
    funcionarioService.buscarPorNome("Paulo Silveira").forEach(System.out::println);
  }
}
