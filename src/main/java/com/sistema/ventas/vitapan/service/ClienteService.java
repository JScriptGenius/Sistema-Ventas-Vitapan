package com.sistema.ventas.vitapan.service;

import com.sistema.ventas.vitapan.entities.Cliente;
import java.util.*;

public interface ClienteService {
    Cliente saveCliente(Cliente cliente);
    Optional<Cliente> findClienteById(Long id);
    void updateCliente(Cliente cliente);
}
