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
@Table(name = "localizacao")
public class Localizacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loc_id_localizacao")
	private Long locIdLocalizacao;

	@Column(name = "loc_dsc_bairro_localizacao")
	private String locDscBairroLocalizacao;

	@Column(name = "loc_dsc_cidade_localizacao")
	private String locDscCidadeLocalizacao;

	@Column(name = "loc_dsc_regiao_localizacao")
	private String locDscRegiaoLocalizacao;

	@Column(name = "loc_dsc_pais_localizacao")
	private String locDscPaisLocalizacao;

	@OneToMany(mappedBy = "localizacao")
	private List<OrdemServico> lstOrdemServicos;

	@OneToMany(mappedBy = "localizacao")
	private List<Cliente> lstClientes;

	@OneToMany(mappedBy = "localizacao")
	private List<Prestador> lstPrestador;

	@OneToMany(mappedBy = "localizacao")
	private List<Subcategoria> lstSubcategoria;

	public Localizacao() {

	}

	public Localizacao(String locDscBairroLocalizacao, String locDscCidadeLocalizacao, String locDscRegiaoLocalizacao,
			String locDscPaisLocalizacao) {
		super();
		this.locDscBairroLocalizacao = locDscBairroLocalizacao;
		this.locDscCidadeLocalizacao = locDscCidadeLocalizacao;
		this.locDscRegiaoLocalizacao = locDscRegiaoLocalizacao;
		this.locDscPaisLocalizacao = locDscPaisLocalizacao;
	}

	public String getLocDscBairroLocalizacao() {
		return locDscBairroLocalizacao;
	}

	public void setLocDscBairroLocalizacao(String locDscBairroLocalizacao) {
		this.locDscBairroLocalizacao = locDscBairroLocalizacao;
	}

	public String getLocDscCidadeLocalizacao() {
		return locDscCidadeLocalizacao;
	}

	public void setLocDscCidadeLocalizacao(String locDscCidadeLocalizacao) {
		this.locDscCidadeLocalizacao = locDscCidadeLocalizacao;
	}

	public String getLocDscRegiaoLocalizacao() {
		return locDscRegiaoLocalizacao;
	}

	public void setLocDscRegiaoLocalizacao(String locDscRegiaoLocalizacao) {
		this.locDscRegiaoLocalizacao = locDscRegiaoLocalizacao;
	}

	public String getLocDscPaisLocalizacao() {
		return locDscPaisLocalizacao;
	}

	public void setLocDscPaisLocalizacao(String locDscPaisLocalizacao) {
		this.locDscPaisLocalizacao = locDscPaisLocalizacao;
	}

	public Long getLocIdLocalizacao() {
		return locIdLocalizacao;
	}

}
