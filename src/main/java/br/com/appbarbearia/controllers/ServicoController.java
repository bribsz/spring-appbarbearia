package br.com.appbarbearia.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.appbarbearia.services.ServicoService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/servico")
public class ServicoController {
	
	final ServicoService servicoService;

	public ServicoController(ServicoService servicoService) {
		this.servicoService = servicoService;
	}
	
}
