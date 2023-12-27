package com.sistema.ventas.vitapan.service;

import com.sistema.ventas.vitapan.entities.Producto;
import java.util.*;

public interface ProductoService {
    Producto saveProducto(Producto producto);
    Optional<Producto> findProductoById(Long id);
    void updateProducto(Producto producto);
}
