package com.sistema.ventas.vitapan.repository;

import com.sistema.ventas.vitapan.entities.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Long> {
}
