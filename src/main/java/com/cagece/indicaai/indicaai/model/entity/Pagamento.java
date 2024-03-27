package com.cagece.indicaai.indicaai.model.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pag_pagamento")
public class Pagamento {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pag_id_pagamento")
    private Long pagIdPagamento;

    @Column(name = "pag_nom_pagamento")
    private String pagNomPagamento;

    @Column(name = "pag_data_pagamento")
    private LocalDateTime pagDataPagamento;

    @Enumerated(EnumType.STRING)
    @Column(name = "flg_id_estado_pagamento")
    private FlgEstadoPagamento flgIdEstadoPagamento;

    @ManyToOne
    @JoinColumn(name = "flg_id_forma_pagamento")
    private FlgEstadoPagamento formaPagamento;
    
    @OneToOne(mappedBy = "pagamento")
    private OrdemServico ordemServico;
    
    public Pagamento() {
 
    }

	public Pagamento(String pagNomPagamento, LocalDate pagDataPagamento,
			FlgEstadoPagamento flgIdEstadoPagamento, FlgEstadoPagamento formaPagamento) {
		this.pagNomPagamento = pagNomPagamento;
		this.pagDataPagamento = LocalDateTime.now(ZoneId.of("UTC"));
		this.flgIdEstadoPagamento = flgIdEstadoPagamento;
		this.formaPagamento = formaPagamento;
	}

	public Long getPagIdPagamento() {
		return pagIdPagamento;
	}


	public String getPagNomPagamento() {
		return pagNomPagamento;
	}

	public void setPagNomPagamento(String pagNomPagamento) {
		this.pagNomPagamento = pagNomPagamento;
	}

	public LocalDateTime getPagDataPagamento() {
		return pagDataPagamento;
	}

	public FlgEstadoPagamento getFlgIdEstadoPagamento() {
		return flgIdEstadoPagamento;
	}

	public void setFlgIdEstadoPagamento(FlgEstadoPagamento flgIdEstadoPagamento) {
		this.flgIdEstadoPagamento = flgIdEstadoPagamento;
	}

	public FlgEstadoPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FlgEstadoPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
    
    
}
