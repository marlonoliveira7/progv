package br.edu.cesmac.progv.resource;

import br.edu.cesmac.progv.entity.Cliente;
import br.edu.cesmac.progv.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteResource {

    @Autowired
    ClienteService clienteService;

    @RequestMapping(value = "/clientes", method = RequestMethod.GET)
    public List<Cliente> buscarClientes() {
        return this.clienteService.buscarClientes();}

    @RequestMapping(value = "/clientes/{id}", method = RequestMethod.GET)
    public Cliente buscarCliente(@RequestParam("id") Long id) {
        return this.clienteService.buscarCliente(id); }

    @RequestMapping(value = "/produto", method = RequestMethod.POST)
    public Cliente cadastroCliente(@RequestBody Cliente cliente) {
        return this.clienteService.cadastro(cliente);
    }

    @RequestMapping(value = "/clientes/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
        this.clienteService.deletar(id);
    }

    @RequestMapping(value = "/clientes", method = RequestMethod.PUT)
    public Cliente alterar(@RequestBody Cliente cliente) {
        this.clienteService.cadastro(cliente);
        return cliente;
    }
}