package com.manahuia.manahuia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manahuia.manahuia.model.Pedido;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long>{
}
