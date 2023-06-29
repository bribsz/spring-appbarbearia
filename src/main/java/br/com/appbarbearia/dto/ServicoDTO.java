package br.com.appbarbearia.dto;

import jakarta.validation.constraints.NotBlank;

public class ServicoDTO {
	
	@NotBlank
	private String nomeBarbeiro;	
	
	@NotBlank
	private String descricao;
	
	@NotBlank
	private float valor;
	
	@NotBlank
	private String observacao;

	public String getNomeBarbeiro() {
		return nomeBarbeiro;
	}

	public void setNomeBarbeiro(String nomeBarbeiro) {
		this.nomeBarbeiro = nomeBarbeiro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
