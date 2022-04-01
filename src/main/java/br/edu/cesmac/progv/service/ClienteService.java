package br.edu.cesmac.progv.service;

import br.edu.cesmac.progv.entity.Cliente;
import br.edu.cesmac.progv.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteService implements IClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> buscarClientes() {
        return this.clienteRepository.findAll();
    }
    @Override
    public Cliente buscarCliente(Long id) {
        return this.clienteRepository.findById(id);
    }
    public Cliente cadastro(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }
    public void deletar(Long id) {
        this.clienteRepository.deleteById(id);
    }
}
