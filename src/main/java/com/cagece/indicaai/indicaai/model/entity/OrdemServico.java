package com.cagece.indicaai.indicaai.model.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ors_ordem_servico")
public class OrdemServico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ors_id_os")
	private Long orsIdOs;

	@Column(name = "ors_titulo_os")
	private String orsTituloOs;

	@Column(name = "ors_data_agendamento")
	private LocalDate orsDataAgendamento;

	@Column(name = "ors_data_realizacao")
	private LocalDate orsDataRealizacao;

	@Column(name = "ors_valor_os")
	private Long orsValorOs;

	@ManyToOne
	@JoinColumn(name = "cli_id_cliente")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "pre_id_prestador")
	private Prestador prestador;

	@Enumerated(EnumType.STRING)
	@Column(name = "flg_id_estado_os")
	private flgEstadoOrdemServico flgEstadoOrdemServico;

	@ManyToOne
	@JoinColumn(name = "flg_id_form_pag")
	private Pagamento Pagamento;

	@ManyToOne
	@JoinColumn(name = "ser_id_servico")
	private Servico servico;

	@ManyToOne
	@JoinColumn(name = "loc_id_localizacao")
	private Localizacao localizacao;

	@OneToOne
	@JoinColumn(name = "avs_id_avalicao_servico")
	private AvaliacaoServico avaliacaoServico;

	public OrdemServico() {

	}

	public OrdemServico(String orsTituloOs, LocalDate orsDataAgendamento, LocalDate orsDataRealizacao,
			Long orsValorOs) {
		this.orsTituloOs = orsTituloOs;
		this.orsDataAgendamento = orsDataAgendamento;
		this.orsDataRealizacao = orsDataRealizacao;
		this.orsValorOs = orsValorOs;
	}

	public String getOrsTituloOs() {
		return orsTituloOs;
	}

	public void setOrsTituloOs(String orsTituloOs) {
		this.orsTituloOs = orsTituloOs;
	}

	public LocalDate getOrsDataAgendamento() {
		return orsDataAgendamento;
	}

	public void setOrsDataAgendamento(LocalDate orsDataAgendamento) {
		this.orsDataAgendamento = orsDataAgendamento;
	}

	public LocalDate getOrsDataRealizacao() {
		return orsDataRealizacao;
	}

	public void setOrsDataRealizacao(LocalDate orsDataRealizacao) {
		this.orsDataRealizacao = orsDataRealizacao;
	}

	public Long getOrsValorOs() {
		return orsValorOs;
	}

	public void setOrsValorOs(Long orsValorOs) {
		this.orsValorOs = orsValorOs;
	}

	public Long getOrsIdOs() {
		return orsIdOs;
	}

}
