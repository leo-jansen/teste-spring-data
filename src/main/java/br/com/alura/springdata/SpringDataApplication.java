package br.com.alura.springdata;

import java.math.BigDecimal;
import java.time.LocalDate;

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
    Cargo cargo = new Cargo("Desenvolvedor");
    cargoService.salvar(cargo);
    /*
     * cargoService.atualizar(3, "Analista de dados");
     * cargoService.buscar().forEach(System.out::println); // printa todos os cargos do BD 
     * cargoService.deletarPorId(1);
     */
    Funcionario funcionario = new Funcionario("Nico", "222.222.222-22", new BigDecimal("10000"), cargo);
    funcionarioService.salvar(funcionario);
    funcionarioService.buscarPorNome("Paulo Silveira").forEach(System.out::println);
    funcionarioService
        .buscarNomeSalarioMaiorDataContratacao("Gulherme Silveira", new BigDecimal("20000"), LocalDate.now())
        .forEach(System.out::println);
    funcionarioService.buscarFuncionariosSalarios().forEach(System.out::println);
  }
}
