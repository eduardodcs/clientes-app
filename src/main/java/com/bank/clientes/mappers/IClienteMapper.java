package com.bank.clientes.mappers;

import org.mapstruct.Mapper;

import com.bank.clientes.controllers.dtos.ClienteDTO;
import com.bank.clientes.core.entities.Cliente;
import com.bank.clientes.repositories.entities.ClienteEntity;

@Mapper(componentModel = "spring")
public interface IClienteMapper {

    ClienteDTO toClienteDto(Cliente cliente);
    Cliente toCliente(ClienteDTO clienteDTO);
    ClienteEntity toClienteEntity(Cliente cliente);
    Cliente toCliente(ClienteEntity clienteEntity);
}
