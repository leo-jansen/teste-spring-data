package br.com.alura.springdata.services;

import org.springframework.stereotype.Service;

import br.com.alura.springdata.entities.Cargo;
import br.com.alura.springdata.repositories.CargoRepository;

@Service
public class CargoService {
  private final CargoRepository cargoRepository;

  public CargoService(CargoRepository cargoRepository) {
    this.cargoRepository = cargoRepository;
  }

  public void salvar(Cargo cargo) {
    // logica para salvar no banco de dados
    cargoRepository.save(cargo);
  }

  public void atualizar(Integer id, String descricao) {
    Cargo cargo = new Cargo(id, descricao);
    cargoRepository.save(cargo);
  }

  public Iterable<Cargo> buscar() {
    Iterable<Cargo> cargos = cargoRepository.findAll();
    return cargos;
  }

  public void deletarPorId(Integer id) {
    cargoRepository.deleteById(id);
  }
}
