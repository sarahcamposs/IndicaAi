package com.cagece.indicaai.indicaai.model.entity;

import java.math.BigDecimal;
import java.util.List;

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
import jakarta.persistence.Table;

@Entity
@Table(name = "ser_servico")
public class Servico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ser_id_servico")
	private Long serIdServico;

	@Column(name = "ser_dsc_servico")
	private String serDscServico;

	@Column(name = "ser_valor_servico")
	private BigDecimal serValorServico;

	@Enumerated(EnumType.STRING)
	@Column(name = "flg_id_estado_servico")
	private FlgEstadoServico estadoServico;

	@OneToMany
	@JoinColumn(name = "pre_id_prestador_servico")
	private Prestador prestador;

	@ManyToOne
	@JoinColumn(name = "suc_id_subcategoria")
	private Subcategoria subcategoria;
	
	@OneToMany(mappedBy = "servico")
	private List<OrdemServico> lstOrdemServico;
	

	public Servico() {

	}


	public Servico(String serDscServico, BigDecimal serValorServico) {
		this.serDscServico = serDscServico;
		this.serValorServico = serValorServico;
	}


	public String getSerDscServico() {
		return serDscServico;
	}


	public void setSerDscServico(String serDscServico) {
		this.serDscServico = serDscServico;
	}


	public BigDecimal getSerValorServico() {
		return serValorServico;
	}


	public void setSerValorServico(BigDecimal serValorServico) {
		this.serValorServico = serValorServico;
	}


	public Long getSerIdServico() {
		return serIdServico;
	}

	
	
}
