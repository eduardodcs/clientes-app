package com.bank.clientes.adapters.gateways;

import java.util.Optional;

import com.bank.clientes.core.entities.Cliente;

public interface IClienteGateway extends ICrudGateway<Cliente, Long> {

    Optional<Cliente> buscarPorCpf(String cpf);

}
