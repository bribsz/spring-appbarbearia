package br.com.appbarbearia.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.appbarbearia.models.ServicoModel;

public interface ServicoRepository extends JpaRepository<ServicoModel, UUID>{

}
