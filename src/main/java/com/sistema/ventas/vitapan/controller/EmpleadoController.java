package com.sistema.ventas.vitapan.controller;

import com.sistema.ventas.vitapan.repository.EmpleadoRepository;
import com.sistema.ventas.vitapan.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/lista-empleados")
    public String listaEmpleados() {
        return "/usuario/listaEmpleados";
    }
}
