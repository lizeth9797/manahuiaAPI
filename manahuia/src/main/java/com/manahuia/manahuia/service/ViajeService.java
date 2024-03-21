package com.manahuia.manahuia.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.manahuia.manahuia.model.Viaje;

@Service
public class ViajeService {
	public final ArrayList<Viaje> list=new ArrayList();
	public ViajeService() {
		list.add( new Viaje("Aventura Maya en Península Yucateca", "2024-04-06","2024-04-16", 10,"Guía turístico, Transporte incluido", "Embárcate en un apasionante tour de cinco días explorando la rica historia y cultura de la civilización maya en la Península Yucateca. Desde la animada Mérida hasta las impresionantes ruinas de Chichén Itzá, las playas relajantes de Playa del Carmen y las antiguas ruinas de Tulum, nuestro viaje incluye alojamiento de calidad, transporte cómodo y guías expertos para una experiencia inolvidable. Reserva ahora para sumergirte en esta emocionante aventura!", 10000.00,"https://res.cloudinary.com/dezqwhec1/image/upload/v1709681353/viajes/ntyanp8ksdfp9ixxz88p.jpg",20));
		list.add( new Viaje("Bacalar", "2024-04-06","2024-04-16", 10,"Guía turístico, Transporte incluido", "Embárcate en un apasionante tour de cinco días explorando la rica historia y cultura de la civilización maya en la Península Yucateca. Desde la animada Mérida hasta las impresionantes ruinas de Chichén Itzá, las playas relajantes de Playa del Carmen y las antiguas ruinas de Tulum, nuestro viaje incluye alojamiento de calidad, transporte cómodo y guías expertos para una experiencia inolvidable. Reserva ahora para sumergirte en esta emocionante aventura!", 10000.00,"https://res.cloudinary.com/dezqwhec1/image/upload/v1709681353/viajes/ntyanp8ksdfp9ixxz88p.jpg",20));
		list.add( new Viaje("Chiapas", "2024-04-06","2024-04-16", 10,"Guía turístico, Transporte incluido", "Embárcate en un apasionante tour de cinco días explorando la rica historia y cultura de la civilización maya en la Península Yucateca. Desde la animada Mérida hasta las impresionantes ruinas de Chichén Itzá, las playas relajantes de Playa del Carmen y las antiguas ruinas de Tulum, nuestro viaje incluye alojamiento de calidad, transporte cómodo y guías expertos para una experiencia inolvidable. Reserva ahora para sumergirte en esta emocionante aventura!", 10000.00,"https://res.cloudinary.com/dezqwhec1/image/upload/v1709681353/viajes/ntyanp8ksdfp9ixxz88p.jpg",20));		
	}
	
	
	public ArrayList<Viaje> getAllViajes() {
		return list;
	}


	public Viaje getViaje(int viajeId) {
		Viaje tempViaje=null;
		for (Viaje viaje : list) {
			if(viaje.getId()==viajeId) {
				tempViaje=viaje;
				break;
			}
		}
		return tempViaje;	
	}

	
	public Viaje addViaje(Viaje viaje) {
		Viaje tempViaje=null;
		if(list.add(viaje)) {
			tempViaje=viaje;
		}
		return tempViaje;	}


	public Viaje deleteViaje(int viajeId) {
		Viaje tempViaje=null;
		for (Viaje viaje : list) {
			if(viaje.getId()==viajeId) {
				tempViaje=viaje;
				list.remove(viaje); 
				break;
			}
		}//endFor each
		return tempViaje;
	}


	public Viaje updateViaje(int viajeId, String nombre_destino, String fecha_inicio, String fecha_final,
			int duracion_dias, String incluye, String descripcion, Double precio, String imagenes, int stock) {
		Viaje tempViaje=null;
		for (Viaje viaje : list) {
			if(viaje.getId()==viajeId) {
				tempViaje=viaje;
				if(nombre_destino.length()!=0) viaje.setNombre_destino(nombre_destino);
				if(fecha_inicio.length()!=0) viaje.setFecha_inicio(fecha_inicio);
				if(fecha_final.length()!=0) viaje.setFecha_final(fecha_final);
				if(duracion_dias> 0) viaje.setDuracion_dias(duracion_dias);
				if(incluye.length()!=0) viaje.setIncluye(incluye);
				if(descripcion.length()!=0) viaje.setDescripcion(descripcion);
				if(precio.doubleValue()>0) viaje.setPrecio(precio);
				if(imagenes.length()!=0) viaje.setImagenes(imagenes);
				if(stock > 0) viaje.setStock(stock);
				tempViaje=viaje;
				break;
			}
		}//endFor each
		return tempViaje;
		
	}
}
