package br.com.appbarbearia.services;

import org.springframework.stereotype.Service;

import br.com.appbarbearia.repositories.ServicoRepository;

@Service
public class ServicoService {
	
	final ServicoRepository servicoRepository;

	public ServicoService(ServicoRepository servicoRepository) {
		this.servicoRepository = servicoRepository;
	}
	
	

}
