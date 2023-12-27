package com.sistema.ventas.vitapan.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "ventas"
)
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Long idVenta;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column(name = "fecha_venta")
    private Date fechaVenta;

    @Column(name = "total_venta")
    private Double totalVenta;

    @OneToMany(mappedBy = "venta")
    private List<DetalleVenta> detallesVenta;
}
