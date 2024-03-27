package com.cagece.indicaai.indicaai.model.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cat_categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cat_id_categoria")
	private Long catIdCategoria;

	@Column(name = "cat_dsc_categoria")
	private String catNomCategoria;

	@OneToMany(mappedBy = "categoria")
	private List<Subcategoria> lstSubcategoria;

	public Categoria() {

	}

	public Categoria(String catNomCategoria) {
		this.catNomCategoria = catNomCategoria;
	}

	public String getCatNomCategoria() {
		return catNomCategoria;
	}

	public void setCatNomCategoria(String catNomCategoria) {
		this.catNomCategoria = catNomCategoria;
	}

	public Long getCatIdCategoria() {
		return catIdCategoria;
	}

}
