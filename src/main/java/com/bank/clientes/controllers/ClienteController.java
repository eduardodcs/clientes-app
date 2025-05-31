package com.bank.clientes.controllers;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.clientes.adapters.usecases.IClienteUseCase;
import com.bank.clientes.controllers.dtos.ClienteDTO;
import com.bank.clientes.mappers.IClienteMapper;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PutMapping;

@Validated
@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private IClienteUseCase clienteUseCase;

    @Autowired
    private IClienteMapper clienteMapper;

    @PostMapping
    public ResponseEntity<ClienteDTO> criarCliente(@Valid @RequestBody ClienteDTO clienteDTO) {
        return ResponseEntity.ok(clienteMapper.toClienteDto(
                clienteUseCase.salvar(clienteMapper.toCliente(clienteDTO))));
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<ClienteDTO> buscarPorCpf(@PathVariable @CPF(message = "CPF inválido") String cpf) {
        return ResponseEntity.ok(clienteMapper.toClienteDto(clienteUseCase.buscarPorCpf(cpf)));
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<ClienteDTO> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(clienteMapper.toClienteDto(clienteUseCase.buscarPorId(id)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClienteDTO> atualizar(@PathVariable Long id, @RequestBody ClienteDTO clienteDTO) {
        return ResponseEntity.ok(clienteMapper.toClienteDto(
                clienteUseCase.atualizar(id, clienteMapper.toCliente(clienteDTO))));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> ativarInativar(@PathVariable Long id) {
        clienteUseCase.ativarInativar(id);
        return ResponseEntity.noContent().build();
    }

}
