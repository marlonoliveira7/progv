package br.edu.cesmac.progv.service;

import br.edu.cesmac.progv.entity.Cliente;

import java.util.List;

public interface IClienteService {
    List<Cliente> buscarClientes();

    Cliente buscarCliente(Long id);

    Cliente cadastro(Cliente cliente);
}
