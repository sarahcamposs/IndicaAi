package com.cagece.indicaai.indicaai.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cagece.indicaai.indicaai.model.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@SuppressWarnings("unused")
	@Autowired
	private ClienteService clienteService;

}
