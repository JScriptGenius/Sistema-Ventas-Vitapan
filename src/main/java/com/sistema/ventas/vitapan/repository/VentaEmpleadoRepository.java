package com.sistema.ventas.vitapan.repository;

import com.sistema.ventas.vitapan.entities.VentaEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaEmpleadoRepository extends JpaRepository<VentaEmpleado, Long> {
}
