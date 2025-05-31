package com.bank.clientes.adapters.usecases;

import com.bank.clientes.core.entities.Cliente;

public interface IClienteUseCase {

    Cliente salvar(Cliente cliente);
    Cliente buscarPorCpf(String cpf);
    Cliente buscarPorId(Long id);
    Cliente atualizar(Long id, Cliente cliente);
    void ativarInativar(Long id);

}
