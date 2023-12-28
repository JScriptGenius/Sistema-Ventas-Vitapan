package com.sistema.ventas.vitapan.controller;

import com.sistema.ventas.vitapan.repository.ClienteRepository;
import com.sistema.ventas.vitapan.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/lista-clientes")
    public String listaClientes() {
        return "/cliente/listaClientes";
    }

    @GetMapping("/registrar-cliente")
    public String registrarCliente() {
        return "/cliente/registrarCliente";
    }
}
