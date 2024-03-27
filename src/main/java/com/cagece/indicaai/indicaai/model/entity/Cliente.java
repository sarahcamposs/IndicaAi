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
import jakarta.persistence.Table;

@Entity
@Table(name = "cli_cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cli_id_cliente")
	private Long cliIdCliente;

	@Column(name = "cli_dsc_cliente")
	private String cliNomClinte;

	@Column(name = "cli_telefone_cliente")
	private String cliTelefoneCliente;

	@ManyToOne
	@JoinColumn(name = "loc_id_localizacao")
	private Localizacao localizacao;

	@OneToMany(mappedBy = "cliente")
	private List<OrdemServico> lstOrdemServicos;

	public Cliente() {

	}

	public Cliente(Long cliIdCliente, String cliNomClinte, String cliTelefoneCliente) {

		this.cliIdCliente = cliIdCliente;
		this.cliNomClinte = cliNomClinte;
		this.cliTelefoneCliente = cliTelefoneCliente;
	}

	public Long getCliIdCliente() {
		return cliIdCliente;
	}

	public String getCliNomClinte() {
		return cliNomClinte;
	}

	public void setCliNomClinte(String cliNomClinte) {
		this.cliNomClinte = cliNomClinte;
	}

	public String getCliTelefoneCliente() {
		return cliTelefoneCliente;
	}

	public void setCliTelefoneCliente(String cliTelefoneCliente) {
		this.cliTelefoneCliente = cliTelefoneCliente;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

}
