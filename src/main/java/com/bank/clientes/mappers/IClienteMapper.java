package com.bank.clientes.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ObjectFactory;

import com.bank.clientes.controllers.dtos.ClienteDTO;
import com.bank.clientes.core.entities.Cliente;
import com.bank.clientes.repositories.entities.ClienteEntity;

@Mapper(componentModel = "spring")
public interface IClienteMapper {


    @ObjectFactory
    default ClienteDTO toClienteDto(Cliente cliente) {
        return new ClienteDTO.Builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .cpf(cliente.getCpf())
                .telefone(cliente.getTelefone())
                .cep(cliente.getCep())
                .endereco(cliente.getEndereco())
                .numero(cliente.getNumero())
                .complemento(cliente.getComplemento())
                .cidade(cliente.getCidade())
                .uf(cliente.getUf())
                .dataNascimento(cliente.getDataNascimento())
                .ativo(cliente.isAtivo())
                .build();
    }

    @ObjectFactory
    default Cliente toCliente(ClienteDTO clienteDTO) {
        return new Cliente.Builder()
                .id(clienteDTO.getId())
                .nome(clienteDTO.getNome())
                .cpf(clienteDTO.getCpf())
                .telefone(clienteDTO.getTelefone())
                .cep(clienteDTO.getCep())
                .endereco(clienteDTO.getEndereco())
                .numero(clienteDTO.getNumero())
                .complemento(clienteDTO.getComplemento())
                .cidade(clienteDTO.getCidade())
                .uf(clienteDTO.getUf())
                .dataNascimento(clienteDTO.getDataNascimento())
                .build();
    }
    @ObjectFactory
    default ClienteEntity toClienteEntity(Cliente cliente) {
        return ClienteEntity.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .cpf(cliente.getCpf())
                .telefone(cliente.getTelefone())
                .cep(cliente.getCep())
                .endereco(cliente.getEndereco())
                .numero(cliente.getNumero())
                .complemento(cliente.getComplemento())
                .cidade(cliente.getCidade())
                .uf(cliente.getUf())
                .dataNascimento(cliente.getDataNascimento())
                .ativo(cliente.isAtivo())
                .dataHoraCadastro(cliente.getDataHoraCadastro())
                .build();
    }

    @ObjectFactory
    default Cliente toCliente(ClienteEntity clienteEntity) {
        return new Cliente.Builder()
                .id(clienteEntity.getId())
                .nome(clienteEntity.getNome())
                .cpf(clienteEntity.getCpf())
                .telefone(clienteEntity.getTelefone())
                .cep(clienteEntity.getCep())
                .endereco(clienteEntity.getEndereco())
                .numero(clienteEntity.getNumero())
                .complemento(clienteEntity.getComplemento())
                .cidade(clienteEntity.getCidade())
                .uf(clienteEntity.getUf())
                .dataNascimento(clienteEntity.getDataNascimento())
                .build();
    }
}
