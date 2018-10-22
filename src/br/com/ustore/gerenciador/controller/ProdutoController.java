package br.com.ustore.gerenciador.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.com.ustore.gerenciador.model.dao.ProdutoDao;
import br.com.ustore.gerenciador.model.entities.Produto;
import br.com.ustore.gerenciador.util.Util;

@Controller
public class ProdutoController {

	@RequestMapping("exibirInserir")
	public String exibirInserir() {
		System.out.println("Exibindo Tela de inserção de Produto.");
		return "produto/inserir";
	}

	@RequestMapping("inserir")
	public String save(Produto produto, @RequestParam("file") MultipartFile imagem, Model model) {

		if (Util.fazerUploadImagem(imagem)) {
			produto.setImagem(Util.obterMomentoAtual() + " - " + imagem.getOriginalFilename());
		}

		ProdutoDao dao = new ProdutoDao();
		dao.inserir(produto);
		
		model.addAttribute("msg", "Produto Cadastrado com sucesso!");
		return "exibirInserir";
	}

	@RequestMapping("exibirConsulta")
	public String exibirConsulta(Model model) {
		ProdutoDao dao = new ProdutoDao();
		List<Produto> listaProduto = dao.listar();
		model.addAttribute("listaProduto", listaProduto);
		
		System.out.println("Exibindo Tela de Consulta com TagLib.");
		return "produto/consultar";
	}
	
	@RequestMapping("exibirAlterar")
	public String exibirAlterar() {
		System.out.println("Exibindo Tela de inserção de Produto.");
		return "produto/alterar";
	}


}
