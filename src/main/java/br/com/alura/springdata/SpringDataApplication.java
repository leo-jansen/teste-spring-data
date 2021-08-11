package br.com.alura.springdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.springdata.entities.Cargo;
import br.com.alura.springdata.repositories.CargoRepository;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {
	private final CargoRepository cargoRepository;

	SpringDataApplication(CargoRepository cargoRepository) {
		this.cargoRepository = cargoRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cargo cargo = new Cargo("Desenvolvedor de Software");
		cargoRepository.save(cargo);
	}
}
