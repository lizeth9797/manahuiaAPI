package com.manahuia.manahuia.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manahuia.manahuia.model.Pedido;
import com.manahuia.manahuia.repository.PedidoRepository;

@Service
public class PedidoService {
	
	public final PedidoRepository pedidoRepository;
	@Autowired
	public PedidoService(PedidoRepository pedidoRepository ) {
		this.pedidoRepository=pedidoRepository;
	}//constructor
	
	public List<Pedido> getAllPedidos() {
		return pedidoRepository.findAll();
	}
	
	public Pedido getPedido(Long pedidoId) {
		return pedidoRepository.findById(pedidoId).orElseThrow(
				()->new IllegalArgumentException("El pedido con el id ["+pedidoId+"] no existe"));
	}
	
	public Pedido addPedido(Pedido pedido) {
		Pedido tempPedido=null;
		tempPedido=pedidoRepository.save(pedido);
		 return tempPedido;
	}
}
