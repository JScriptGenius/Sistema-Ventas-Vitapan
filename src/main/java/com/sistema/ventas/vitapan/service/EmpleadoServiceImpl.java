package com.sistema.ventas.vitapan.service;

import com.sistema.ventas.vitapan.entities.Empleado;
import com.sistema.ventas.vitapan.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Override
    public Empleado saveEmpleado(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Optional<Empleado> findEmpleadoById(Long id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public void updateEmpleado(Empleado empleado) {
        empleadoRepository.save(empleado);
    }
}
