package com.manahuia.manahuia.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manahuia.manahuia.model.Viaje;

@Repository
public interface ViajeRepository extends JpaRepository<Viaje,Long>{
	Optional<Viaje>findByNombreDestino(String nombreDestino); 
}

 