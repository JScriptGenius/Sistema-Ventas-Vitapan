package com.sistema.ventas.vitapan.service;

import com.sistema.ventas.vitapan.entities.Empleado;
import java.util.*;

public interface EmpleadoService {
    Empleado saveEmpleado(Empleado empleado);
    Optional<Empleado> findEmpleadoById(Long id);
    void updateEmpleado(Empleado empleado);
}
