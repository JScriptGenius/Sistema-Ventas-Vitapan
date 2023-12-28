package com.sistema.ventas.vitapan.controller;

import com.sistema.ventas.vitapan.repository.ProductoRepository;
import com.sistema.ventas.vitapan.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private ProductoService productoService;

    @GetMapping("/lista-productos")
    public String listaProductos() {
        return "/producto/listaProductos";
    }

    @GetMapping("/registrar-producto")
    public String registrarProducto() {
        return "/producto/registrarProducto";
    }

}
