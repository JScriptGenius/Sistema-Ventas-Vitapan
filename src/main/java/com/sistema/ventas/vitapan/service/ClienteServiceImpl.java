package com.sistema.ventas.vitapan.service;

import com.sistema.ventas.vitapan.entities.Cliente;
import com.sistema.ventas.vitapan.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Optional<Cliente> findClienteById(Long id) {
        return clienteRepository.findById(id);
    }

    @Override
    public void updateCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }
}
