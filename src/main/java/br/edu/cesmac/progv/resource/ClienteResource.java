package br.edu.cesmac.progv.resource;

import br.edu.cesmac.progv.entity.Cliente;
import br.edu.cesmac.progv.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

    @Autowired
    ClienteRepository clienteRepository;

    //LISTANDO TODOS OS CLIENTES
    @RequestMapping(method = RequestMethod.GET)
    public List<Cliente> listar(){
        return this.clienteRepository.findAll();
    }

    //LISTAR CLIENTE POR ID
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Cliente listarId(@RequestParam("id") Long id){return this.clienteRepository.findById();}

    //CADASTRO NOVO CLIENTE
    @RequestMapping(method = RequestMethod.POST)
    public Cliente cadastrar(@RequestBody Cliente cliente){
        return this.clienteRepository.save(cliente);
    }

    //DELETANDO CLIENTE
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public Cliente deletar(@RequestParam("id") Long id){return this.clienteRepository.findById();}
}
