package com.sistema.ventas.vitapan.repository;

import com.sistema.ventas.vitapan.entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

    @Query(" SELECT E FROM Empleado E WHERE E.estado = 1 ")
    List<Empleado> findAllEmpleados();

    @Transactional
    @Modifying
    @Query(" UPDATE Empleado E SET E.estado = 0 WHERE E.idEmpleado = :idEmpleado ")
    void disableEmpleado(@Param("idEmpleado") Long idEmpleado);
}
