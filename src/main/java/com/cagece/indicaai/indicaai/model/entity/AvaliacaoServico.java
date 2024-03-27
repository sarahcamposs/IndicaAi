package com.cagece.indicaai.indicaai.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "avs_avaliacao_servico")
public class AvaliacaoServico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "avs_id_avaliacao_servico")
	private Long avsIdAvaliacaoServico;

	@Column(name = "avs_titulo_avaliacao_servico")
	private String avsTituloAvaliacaoServico;

	@Column(name = "avs_comentarios_avaliacao_servico")
	private String avsComentarioAvaliacaoServico;
	
	@OneToOne
	@JoinColumn(name = "ors_id_os")
	private OrdemServico ordemServico;

	
	public AvaliacaoServico() {

	}

	public AvaliacaoServico(String avsTituloAvaliacaoServico, String avsComentarioAvaliacaoServico) {
		this.avsTituloAvaliacaoServico = avsTituloAvaliacaoServico;
		this.avsComentarioAvaliacaoServico = avsComentarioAvaliacaoServico;
	}

	public Long getAvsIdAvs() {
		return avsIdAvaliacaoServico;
	}

	

	public String getAvsTituloAvs() {
		return avsTituloAvaliacaoServico;
	}

	public void setAvsTituloAvs(String avsTituloAvs) {
		this.avsTituloAvaliacaoServico = avsTituloAvs;
	}

	public String getAvsComentarioAvs() {
		return avsComentarioAvaliacaoServico;
	}

	public void setAvsComentarioAvs(String avsComentarioAvs) {
		this.avsComentarioAvaliacaoServico = avsComentarioAvs;
	}
	
	

}
