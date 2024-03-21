package com.manahuia.manahuia.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manahuia.manahuia.model.Pedido;
import com.manahuia.manahuia.service.PedidoService;


@RestController
@RequestMapping(path="/api/pedido/") //http://localhost:8080/api/pedido/
public class PedidoController {
	private final PedidoService pedidoService;
	@Autowired
	public PedidoController(PedidoService pedidoService ) {
		this.pedidoService=pedidoService;
	}//constructor
	
	//GET all
	@GetMapping
	public ArrayList<Pedido> getPedidos(){
		return pedidoService.getAllPedidos();
	}
	
	//POST
	@PostMapping
	public Pedido addPedido(@RequestBody Pedido pedido) {
		return pedidoService.addPedido(pedido);
	}
	
}
