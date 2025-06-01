package com.bank.clientes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bank.clientes.adapters.gateways.IClienteGateway;
import com.bank.clientes.adapters.usecases.IClienteUseCase;
import com.bank.clientes.core.usecases.ClienteUseCaseImpl;
import com.bank.common_web.handler.GlobalExceptionHandler;

@Configuration
public class BeansConfig {
    
    @Bean
    public GlobalExceptionHandler globalExceptionHandler() {
        return new GlobalExceptionHandler();
    }
    @Bean
    public IClienteUseCase clienteUseCase(IClienteGateway clienteGateway) {
        return new ClienteUseCaseImpl(clienteGateway);
    }
}
