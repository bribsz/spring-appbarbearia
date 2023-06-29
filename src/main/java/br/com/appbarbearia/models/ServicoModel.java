package br.com.appbarbearia.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_servico")
public class ServicoModel implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	@Column(nullable = false)
	private String nomeBarbeiro;
	
	@Column(nullable = false)
	private Date dataAgendamento;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private float valor;
	
	@Column(nullable = false)
	private LocalDateTime horarioAgendamento;
	
	@Column(nullable = false)
	private String observacao;
	
	public ServicoModel(UUID id, String nomeBarbeiro, Date dataAgendamento, String descricao, float valor,
			LocalDateTime horarioAgendamento, String observacao) {
		super();
		this.id = id;
		this.nomeBarbeiro = nomeBarbeiro;
		this.dataAgendamento = dataAgendamento;
		this.descricao = descricao;
		this.valor = valor;
		this.horarioAgendamento = horarioAgendamento;
		this.observacao = observacao;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNomeBarbeiro() {
		return nomeBarbeiro;
	}

	public void setNomeBarbeiro(String nomeBarbeiro) {
		this.nomeBarbeiro = nomeBarbeiro;
	}

	public Date getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
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

	public LocalDateTime getHorarioAgendamento() {
		return horarioAgendamento;
	}

	public void setHorarioAgendamento(LocalDateTime horarioAgendamento) {
		this.horarioAgendamento = horarioAgendamento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
