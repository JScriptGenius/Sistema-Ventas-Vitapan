package com.sistema.ventas.vitapan.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "clientes"
)
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Long idCliente;
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private byte estado;
}
