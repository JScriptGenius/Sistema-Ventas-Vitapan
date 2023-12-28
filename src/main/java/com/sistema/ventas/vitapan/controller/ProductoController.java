package com.sistema.ventas.vitapan.controller;

import com.sistema.ventas.vitapan.entities.Producto;
import com.sistema.ventas.vitapan.repository.ProductoRepository;
import com.sistema.ventas.vitapan.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private ProductoService productoService;

    @GetMapping("/listaProductos")
    public String listaProductos(Model model) {
        model.addAttribute("productos",productoRepository.findAllProductos());
        return "/producto/listaProductos";
    }

    @GetMapping("/nuevoProducto")
    public String nuevoProducto() {
        return "/producto/registrarProducto";
    }

    @PostMapping("/guardarProducto")
    public String guardarProducto(Producto producto) {
        producto.setEstado(1);
        productoService.saveProducto(producto);
        return "redirect:/producto/listaProductos";
    }

    @GetMapping("/editarProducto/{idProducto}")
    public String editarProducto(@PathVariable Long idProducto, Model model) {
        Producto producto = productoService.findProductoById(idProducto).get();
        model.addAttribute("producto",producto);
        return "/producto/actualizarProducto";
    }

    @PostMapping("/actualizarProducto")
    public String actualizarProducto(@RequestParam("idProducto") Long id, Producto producto) {
        Producto productoBD = productoService.findProductoById(id).get();
        productoBD.setNombre(producto.getNombre());
        productoBD.setDescripcion(producto.getDescripcion());
        productoBD.setPrecio(producto.getPrecio());
        productoBD.setStock(producto.getStock());
        producto.setEstado(productoBD.getEstado());
        productoService.updateProducto(producto);
        return "redirect:/producto/listaProductos";
    }

    @GetMapping("/eliminarProducto/{idProducto}")
    public String eliminarProducto(@PathVariable Long idProducto) {
        productoRepository.disableProducto(idProducto);
        return "redirect:/producto/listaProductos";
    }

}
