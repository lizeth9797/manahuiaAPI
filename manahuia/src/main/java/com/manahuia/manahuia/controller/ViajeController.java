package com.manahuia.manahuia.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manahuia.manahuia.model.Viaje;
import com.manahuia.manahuia.service.ViajeService;

@RestController
@RequestMapping(path="/api/viajes/")  //http://localhost:8080/api/viajes/
public class ViajeController {
	
	private final ViajeService viajeService;
	@Autowired
	public ViajeController(ViajeService viajeService ) {
		this.viajeService=viajeService;
	}//constructor
	
	
	//GET all
	@GetMapping
	public ArrayList<Viaje> getViajes(){
		return viajeService.getAllViajes();
	}
	
	//Get by ID
	@GetMapping (path= "{viajeId}")
	public Viaje getViaje(@PathVariable("viajeId") int viajeId) {
		return viajeService.getViaje(viajeId);
	}
	
	//POST 
	@PostMapping
	public Viaje addViaje(@RequestBody Viaje viaje) {
		return viajeService.addViaje(viaje);
	}
	
	//DELETE
	@DeleteMapping(path="{viajeId}")
	public Viaje deleteViaje(@PathVariable("viajeId") int viajeId) { 
		return viajeService.deleteViaje(viajeId);
	}

	//PUT
	@PutMapping(path="{viajeId}")
	public Viaje updateViaje(@PathVariable("viajeId") int viajeId,
			@RequestBody Viaje viaje) {
		return viajeService.updateViaje(viajeId, viaje.getNombre_destino(), viaje.getFecha_inicio(), viaje.getFecha_final(),viaje.getDuracion_dias(),viaje.getIncluye(), viaje.getDescripcion(), Double.valueOf(viaje.getPrecio()), viaje.getImagenes(), viaje.getStock()); 
	}
	
	
}
