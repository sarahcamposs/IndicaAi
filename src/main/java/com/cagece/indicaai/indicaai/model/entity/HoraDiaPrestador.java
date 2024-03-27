package com.cagece.indicaai.indicaai.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "hod_hora_dia_prestador")
public class HoraDiaPrestador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hod_id_hora_dia_prestador")
	private Long idHoraDiaPrestador;

	@Column(name = "hod_hora_dia_prestador")
	private String horaDiaPrestador;

	@ManyToOne
	@JoinColumn(name = "cap_id_calendario_prestador")
	private CalendarioPrestador calendarioPrestador;

	public HoraDiaPrestador() {
	}

	public HoraDiaPrestador(String horaDiaPrestador) {
		this.horaDiaPrestador = horaDiaPrestador;
	}

	public String getHoraDiaPrestador() {
		return horaDiaPrestador;
	}

	public void setHoraDiaPrestador(String horaDiaPrestador) {
		this.horaDiaPrestador = horaDiaPrestador;
	}

	public Long getIdHoraDiaPrestador() {
		return idHoraDiaPrestador;
	}

	
	
}
