package com.sistema.ventas.vitapan.repository;

import com.sistema.ventas.vitapan.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query(" SELECT C FROM Cliente C WHERE C.estado = 1 ")
    List<Cliente> findAllClientes();

    @Query(" UPDATE Cliente C SET C.estado = 0 WHERE C.idCliente = :idCliente ")
    void disableCliente(@Param("idCliente") Long idCliente);
}
