package com.cagece.indicaai.indicaai.model.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "cap_calendario_prestador")
public class CalendarioPrestador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cap_id_calendario_prestador")
	private Long idCalendarioPrestador;
	
	@Column (name = "cap_nom_calendario_prestador")
	private String nomeCalendarioPrestador;
	
	@Column (name = "cap_dia_calendario_prestador", nullable = false)
	private int diaCalendarioPrestador;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "cap_mes_calendario_prestador", nullable = false)
	private String mesCalendarioPrestador;
	
	@OneToMany(mappedBy = "calendarioPrestador")
	private List<HoraDiaPrestador> lstHoraDiaPrestador;
	
    @Enumerated(EnumType.ORDINAL)
	private FlgHoraDiaDisponivel flgIdHoraDiaDisponivel;
    
    @OneToOne(mappedBy = "calendario")
    private Prestador preIdPrestadorServico;
	
	public CalendarioPrestador() {
	}

	
	public CalendarioPrestador(String nomeCalendarioPrestador, int diaCalendarioPrestador,
			String mesCalendarioPrestador) {
		this.nomeCalendarioPrestador = nomeCalendarioPrestador;
		this.diaCalendarioPrestador = diaCalendarioPrestador;
		this.mesCalendarioPrestador = mesCalendarioPrestador;
	}


	public String getNomeCalendarioPrestador() {
		return nomeCalendarioPrestador;
	}

	public void setNomeCalendarioPrestador(String nomeCalendarioPrestador) {
		this.nomeCalendarioPrestador = nomeCalendarioPrestador;
	}

	public int getDiaCalendarioPrestador() {
		return diaCalendarioPrestador;
	}

	public void setDiaCalendarioPrestador(int diaCalendarioPrestador) {
		this.diaCalendarioPrestador = diaCalendarioPrestador;
	}

	public String getMesCalendarioPrestador() {
		return mesCalendarioPrestador;
	}

	public void setMesCalendarioPrestador(String mesCalendarioPrestador) {
		this.mesCalendarioPrestador = mesCalendarioPrestador;
	}
	
	
}
