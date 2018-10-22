package br.com.ustore.gerenciador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ustore.gerenciador.model.dao.ProdutoDao;
import br.com.ustore.gerenciador.model.entities.Produto;

@RestController
@RequestMapping("produtos")
public class ProdutoResources {
	
	@Autowired
	private ProdutoDao dao;
	
	@PostMapping
	public Produto inserir(@Validated @RequestBody Produto produto) {
		dao.inserir(produto);
		return produto;
		
	}

}
