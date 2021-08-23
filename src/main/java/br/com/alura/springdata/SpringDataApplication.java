package br.com.alura.springdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.springdata.entities.Cargo;
import br.com.alura.springdata.services.CargoService;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {
	private final CargoService cargoService;

	SpringDataApplication(CargoService cargoService) {
		this.cargoService = cargoService;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cargo cargo = new Cargo("RH");
		cargoService.salvar(cargo);
		cargoService.atualizar(3, "Analista de dados");
	}
}
