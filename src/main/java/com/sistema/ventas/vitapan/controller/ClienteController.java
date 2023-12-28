package com.sistema.ventas.vitapan.controller;

import com.sistema.ventas.vitapan.entities.Cliente;
import com.sistema.ventas.vitapan.repository.ClienteRepository;
import com.sistema.ventas.vitapan.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/listaClientes")
    public String listaClientes(Model model) {
        model.addAttribute("clientes",clienteRepository.findAllClientes());
        return "/cliente/listaClientes";
    }

    @GetMapping("/nuevoCliente")
    public String registrarCliente() {
        return "/cliente/registrarCliente";
    }

    @PostMapping("/registrarCliente")
    public String registrarCliente(Cliente cliente) {
        cliente.setEstado(1);
        clienteService.saveCliente(cliente);
        return "redirect:/cliente/listaClientes";
    }

    @GetMapping("/editarCliente/{idCliente}")
    public String editarCliente(@PathVariable Long idCliente, Model model) {
        Cliente cliente = clienteService.findClienteById(idCliente).get();
        model.addAttribute("cliente",cliente);
        return "/cliente/actualizarCliente";
    }

    @PostMapping("/actualizarCliente")
    public String actualizarCliente(@RequestParam("idCliente") Long id, Cliente cliente) {
        Cliente clienteBD = clienteService.findClienteById(id).get();
        clienteBD.setDni(cliente.getDni());
        clienteBD.setNombre(cliente.getNombre());
        clienteBD.setApellido(cliente.getApellido());
        clienteBD.setDireccion(cliente.getDireccion());
        clienteBD.setTelefono(cliente.getTelefono());
        cliente.setEstado(clienteBD.getEstado());
        clienteService.updateCliente(cliente);
        return "redirect:/cliente/listaClientes";
    }

    @GetMapping("/eliminarCliente/{idCliente}")
    public String eliminarCliente(@PathVariable Long idCliente) {
        clienteRepository.disableCliente(idCliente);
        return "redirect:/cliente/listaClientes";
    }

}
