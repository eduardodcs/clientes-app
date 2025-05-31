package com.bank.clientes.core.usecases;

import java.text.MessageFormat;
import java.util.Objects;

import com.bank.clientes.adapters.gateways.IClienteGateway;
import com.bank.clientes.adapters.usecases.IClienteUseCase;
import com.bank.clientes.core.entities.Cliente;
import com.bank.clientes.core.exceptions.BusinessException;
import com.bank.clientes.core.exceptions.NotFoundException;

public class ClienteUseCaseImpl implements IClienteUseCase {

    private IClienteGateway clienteGateway;
    
    public ClienteUseCaseImpl(IClienteGateway clienteGateway) {
        this.clienteGateway = clienteGateway;
    }

    @Override
    public Cliente salvar(Cliente cliente) {
        cliente = cliente.toBuilder().id(null).build();
        return this.clienteGateway.salvar(cliente);
    }

    @Override
    public Cliente buscarPorCpf(String cpf) {
        return this.clienteGateway.buscarPorCpf(cpf).orElseThrow(() -> 
            new NotFoundException(MessageFormat.format("Cliente não encontrado com o CPF: {0}", cpf)));
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return this.clienteGateway.buscarPorId(id).orElseThrow(() -> 
            new NotFoundException(MessageFormat.format("Cliente não encontrado com o ID: {0}", id)));
    }

    @Override
    public Cliente atualizar(Long id, Cliente cliente) {
        Cliente clienteSalvo = this.buscarPorId(id);
        validarAtualizacao(clienteSalvo, cliente);
        clienteSalvo = clienteSalvo.toBuilder()
            .nome(cliente.getNome())
            .telefone(cliente.getTelefone())
            .cep(cliente.getCep())
            .endereco(cliente.getEndereco())
            .numero(cliente.getNumero())
            .complemento(cliente.getComplemento())
            .cidade(cliente.getCidade())
            .uf(cliente.getUf())
            .dataNascimento(cliente.getDataNascimento())
            .build();
        return this.clienteGateway.atualizar(clienteSalvo);
    }

    @Override
    public void ativarInativar(Long id) {
        this.buscarPorId(id);
        this.clienteGateway.ativarInativar(id); 
    }

    void validarAtualizacao(Cliente clienteSalvo, Cliente cliente) {
        if (!Objects.isNull(clienteSalvo.getCpf()) && !clienteSalvo.getCpf().equals(cliente.getCpf())) {
            throw new BusinessException("Não é permitido alterar o CPF do cliente.");
        }
    }
}
