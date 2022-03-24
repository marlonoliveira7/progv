package br.edu.cesmac.progv.resource;

import br.edu.cesmac.progv.entity.Produto;
import br.edu.cesmac.progv.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

    @Autowired
    ProdutoRepository produtoRepository;

    @RequestMapping(method = RequestMethod.GET)
        public List<Produto> listarProdutos(){
        return this.produtoRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Produto cadastrar(@RequestBody Produto produto){
       return this.produtoRepository.save(produto);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deletarProduto(@RequestParam("id") Long id){
        this.produtoRepository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Produto atualizar(@RequestBody Produto produto){
        return this.produtoRepository.save(produto);
    }
}
