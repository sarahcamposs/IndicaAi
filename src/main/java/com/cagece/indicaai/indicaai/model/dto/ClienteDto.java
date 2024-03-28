package com.cagece.indicaai.indicaai.model.dto;



public class ClienteDto {
	
	@SuppressWarnings("unused")
	private Long cliIdCliente;
	@SuppressWarnings("unused")
	private String cliNomClinte;
	
	public ClienteDto(Long cliIdCliente, String cliNomClinte) {
		this.cliIdCliente = cliIdCliente;
		this.cliNomClinte = cliNomClinte;
	}
	

}
