package com.sistema.ventas.vitapan.repository;

import com.sistema.ventas.vitapan.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    @Query(" SELECT P FROM Producto P WHERE P.estado = 1 ")
    List<Producto> findAllProductos();

    @Query(" UPDATE Producto P SET P.estado = 0 WHERE P.idProducto = :idProducto ")
    void disableProducto(@Param("idProducto") Long idProducto);
}
