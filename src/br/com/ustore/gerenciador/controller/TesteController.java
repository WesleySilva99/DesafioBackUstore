package br.com.ustore.gerenciador.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TesteController {
	
	@RequestMapping("olaMundo")
	public String ola() {
		return "ola";
	}
	
	@RequestMapping("index")
	public String index() {
		return "index";
	}

}
