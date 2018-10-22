package com.ustore.ustore.resources;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustore.ustore.model.Produto;
import com.ustore.ustore.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
public class ProdutoResources {

	@Autowired
	private ProdutoRepository pr;

	@GetMapping(produces = "aplication/json")
	public @ResponseBody Iterable<Produto> listarProdutos() {

		Iterable<Produto> listaProduto = pr.findAll();

		return listaProduto;

	}

	@PostMapping()
	public Produto save(@RequestBody @Valid Produto p) {

		pr.save(p);

		return p;
	}

	@DeleteMapping()
	public Produto delete(@RequestBody @Valid Produto p) {

		pr.delete(p);
		;

		return p;
	}
	
	@PostMapping(produces = "aplication/json")
	@RequestMapping("/produto/buscaPorId")
	public @ResponseBody Produto produtoPorId(int id) {

		Produto p = pr.buscaPorId(id);
		return p;
		
	}

}
