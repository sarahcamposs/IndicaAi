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
@Table(name = "suc_subcategoria")
public class Subcategoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "suc_id_subcategoria")
	private Long sucIdSubCategoria;

	@Column(name = "suc_dsc_subcategoria")
	private String sucDscSubCategoria;

	@ManyToOne
	@JoinColumn(name = "cat_id_subcategoria")
	private Categoria categoria;

	@ManyToOne
	@JoinColumn(name = "loc_id_localizacao")
	private Localizacao localizacao;

	@OneToMany(mappedBy = "subcategoria")
	private List<Prestador> lstPrestador;
	
	@OneToMany (mappedBy = "servico")
	private List<Servico> lstServico;

	public Subcategoria() {

	}

	public Subcategoria(Long sucIdSubCategoria, String sucDscSubCategoria) {
		this.sucIdSubCategoria = sucIdSubCategoria;
		this.sucDscSubCategoria = sucDscSubCategoria;
	}

	public String getSucDscSubCategoria() {
		return sucDscSubCategoria;
	}

	public void setSucDscSubCategoria(String sucDscSubCategoria) {
		this.sucDscSubCategoria = sucDscSubCategoria;
	}

	public Long getSucIdSubCategoria() {
		return sucIdSubCategoria;
	}

}
