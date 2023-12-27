package com.sistema.ventas.vitapan.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "empleados"
)
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Long idEmpleado;
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String usuario;
    private byte estado;
}
