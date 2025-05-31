package com.bank.clientes.core.usecases;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.bank.clientes.adapters.gateways.IClienteGateway;
import com.bank.clientes.core.entities.Cliente;


class ClienteUseCaseImplTest {

    @InjectMocks
    ClienteUseCaseImpl clienteUseCase;

    @Mock
    IClienteGateway clienteGateway;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testAtivarInativar() {    
        when(clienteGateway.buscarPorId(anyLong())).thenReturn(Optional.of(new Cliente.Builder().id(1L).build()));
        clienteUseCase.ativarInativar(1L);
        verify(clienteGateway, times(1)).ativarInativar(1L);
    }

    // @Test
    // void testAtualizar() {

    // }

    // @Test
    // void testBuscarPorCpf() {

    // }

    // @Test
    // void testBuscarPorId() {

    // }

    // @Test
    // void testSalvar() {

    // }

    // @Test
    // void testValidarAtualizacao() {

    // }
}
