package com.sistema.ventas.vitapan.service;

import com.sistema.ventas.vitapan.entities.Producto;
import com.sistema.ventas.vitapan.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Optional<Producto> findProductoById(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public void updateProducto(Producto producto) {
        productoRepository.save(producto);
    }
}
