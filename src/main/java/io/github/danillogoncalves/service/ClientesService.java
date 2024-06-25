package io.github.danillogoncalves.service;

import io.github.danillogoncalves.model.Cliente;
import io.github.danillogoncalves.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

  private final ClientesRepository clientesRepository;

  @Autowired
  public ClientesService(final ClientesRepository clientesRepository) {
    this.clientesRepository = clientesRepository;
  }

  public void salvarCliente(Cliente cliente) {
    validarCliente(cliente);
    this.clientesRepository.persistir(cliente);
  }

  public void  validarCliente(Cliente cliente) {
  }
}
