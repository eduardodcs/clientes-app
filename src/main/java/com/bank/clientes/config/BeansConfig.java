package com.bank.clientes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bank.clientes.adapters.gateways.IClienteGateway;
import com.bank.clientes.adapters.usecases.IClienteUseCase;
import com.bank.clientes.core.usecases.ClienteUseCaseImpl;

@Configuration
public class BeansConfig {

    @Bean
    public IClienteUseCase clienteUseCase(IClienteGateway clienteGateway) {
        return new ClienteUseCaseImpl(clienteGateway);
    }
}
