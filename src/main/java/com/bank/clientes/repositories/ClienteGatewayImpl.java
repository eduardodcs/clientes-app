package com.bank.clientes.repositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank.clientes.adapters.gateways.IClienteGateway;
import com.bank.clientes.core.entities.Cliente;
import com.bank.clientes.mappers.IClienteMapper;
import com.bank.clientes.repositories.jpa.IClienteRepository;

@Component
public class ClienteGatewayImpl implements IClienteGateway {

    @Autowired
    private IClienteRepository clienteRepository;

    @Autowired
    private IClienteMapper clienteMapper;


    @Override
    public Cliente salvar(Cliente cliente) {
        return clienteMapper.toCliente(this.clienteRepository.save(clienteMapper.toClienteEntity(cliente)));
    }

    @Override
    public Optional<Cliente> buscarPorCpf(String cpf) {
        return this.clienteRepository.findByCpf(cpf).map(entity -> clienteMapper.toCliente(entity));
    }

    @Override
    public Optional<Cliente> buscarPorId(Long id) {
        return this.clienteRepository.findById(id).map(entity -> clienteMapper.toCliente(entity));
    }

    @Override
    public Cliente atualizar(Cliente cliente) {
        return clienteMapper.toCliente(this.clienteRepository.save(clienteMapper.toClienteEntity(cliente)));
    }

    @Override
    public void ativarInativar(Long id) {
        this.clienteRepository.ativarInativar(id);
    }

}
