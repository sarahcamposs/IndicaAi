package com.cagece.indicaai.indicaai.model.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pre_prestador_servico")
public class Prestador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pre_id_prestador_servico")
	private Long preIdPrestadorServico;

	@Column(name = "pre_dsc_prestador_servico")
	private String preNomPrestadorServico;

	@Column(name = "pre_telefone_prestador_servico")
	private String preTelefonePrestadorServico;

	@Column(name = "pre_endereco_prestador_servico")
	private String preEnderecoPrestadorServico;

	@Column(name = "pre_rede_social_prestador_servico")
	private String preRedeSocialPrestadorServico;

	@ManyToOne
	@JoinColumn(name = "loc_id_localizacao")
	private Localizacao localizacao;

	@ManyToOne
	@JoinColumn(name = "suc_id_subcategoria")
	private Subcategoria subcategoria;

	@OneToOne
	@JoinColumn(name = "pre_prestador_servico_estrela")
	private Estrela estrela;

	@OneToOne
	@JoinColumn(name = "cal_calendario")
	private CalendarioPrestador calendario;

	@OneToMany(mappedBy = "prestador")
	private List<OrdemServico> lstOrdemServicos;

	public Prestador() {

	}

	public Prestador(String preNomPrestadorServico, String preTelefonePrestadorServico,
			String preEnderecoPrestadorServico, String preRedeSocialPrestadorServico) {

		this.preNomPrestadorServico = preNomPrestadorServico;
		this.preTelefonePrestadorServico = preTelefonePrestadorServico;
		this.preEnderecoPrestadorServico = preEnderecoPrestadorServico;
		this.preRedeSocialPrestadorServico = preRedeSocialPrestadorServico;
	}

	public Long getPreIdPrestadorServico() {
		return preIdPrestadorServico;
	}

	public String getPreNomPrestadorServico() {
		return preNomPrestadorServico;
	}

	public void setPreNomPrestadorServico(String preNomPrestadorServico) {
		this.preNomPrestadorServico = preNomPrestadorServico;
	}

	public String getPreTelefonePrestadorServico() {
		return preTelefonePrestadorServico;
	}

	public void setPreTelefonePrestadorServico(String preTelefonePrestadorServico) {
		this.preTelefonePrestadorServico = preTelefonePrestadorServico;
	}

	public String getPreEnderecoPrestadorServico() {
		return preEnderecoPrestadorServico;
	}

	public void setPreEnderecoPrestadorServico(String preEnderecoPrestadorServico) {
		this.preEnderecoPrestadorServico = preEnderecoPrestadorServico;
	}

	public String getPreRedeSocialPrestadorServico() {
		return preRedeSocialPrestadorServico;
	}

	public void setPreRedeSocialPrestadorServico(String preRedeSocialPrestadorServico) {
		this.preRedeSocialPrestadorServico = preRedeSocialPrestadorServico;
	}

}
