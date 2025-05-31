package com.bank.clientes.adapters.gateways;

import java.util.Optional;

import com.bank.clientes.core.entities.Cliente;

public interface IClienteGateway {

    Cliente salvar(Cliente cliente);
    Optional<Cliente> buscarPorCpf(String cpf);
    Optional<Cliente> buscarPorId(Long id);
    Cliente atualizar(Cliente cliente);
    void ativarInativar(Long id);

}
