package com.manahuia.manahuia.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.manahuia.manahuia.model.Pedido;

@Service
public class PedidoService {
	public final ArrayList<Pedido> list = new ArrayList();
	public PedidoService() {
		list.add( new Pedido("2024-03-22",2,20000.00,1,3));
		list.add( new Pedido("2024-01-10",5,20000.00,1,3));
		list.add( new Pedido("2024-02-12",16,20000.00,1,3));
	}
	public ArrayList<Pedido> getAllPedidos() {
		return list;
	}
	
	public Pedido addPedido(Pedido pedido) {
		Pedido tempPedido=null;
		if(list.add(pedido)) {
			tempPedido=pedido;
		}
		return tempPedido;
	}
}
