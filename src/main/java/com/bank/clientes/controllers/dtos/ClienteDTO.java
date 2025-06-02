package com.bank.clientes.controllers.dtos;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ClienteDTO {

    private Long id;
    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @NotBlank(message = "CPF é obrigatório")
    @CPF(message = "CPF inválido")
    private String cpf;
    private String telefone;
    @NotNull(message = "CEP é obrigatório")
    private int cep;
    private String endereco;
    private int numero;
    private String complemento;
    private String cidade;
    @Pattern(regexp = "^[A-Z]{2}$", message = "UF deve conter 2 letras maiúsculas")
    private String uf;
    private LocalDate dataNascimento;
    private boolean ativo;

    public ClienteDTO() {
        // Default constructor
    }

    public Builder toBuilder() {
        return new Builder()
                .id(this.id)
                .nome(this.nome)
                .cpf(this.cpf)
                .telefone(this.telefone)
                .cep(this.cep)
                .endereco(this.endereco)
                .numero(this.numero)
                .complemento(this.complemento)
                .cidade(this.cidade)
                .uf(this.uf)
                .dataNascimento(this.dataNascimento)
                .ativo(this.ativo);
    }

    public static class Builder {
        ClienteDTO clienteDTO;
        public Builder() {
            clienteDTO = new ClienteDTO();
        }
        public Builder id(Long id) {
            clienteDTO.id = id;
            return this;
        }
        public Builder nome(String nome) {
            clienteDTO.nome = nome;
            return this;
        }
        public Builder cpf(String cpf) {
            clienteDTO.cpf = cpf;
            return this;
        }
        public Builder telefone(String telefone) {
            clienteDTO.telefone = telefone;
            return this;
        }
        public Builder cep(int cep) {
            clienteDTO.cep = cep;
            return this;
        }
        public Builder endereco(String endereco) {
            clienteDTO.endereco = endereco;
            return this;
        }
        public Builder numero(int numero) {
            clienteDTO.numero = numero;
            return this;
        }
        public Builder complemento(String complemento) {
            clienteDTO.complemento = complemento;
            return this;
        }
        public Builder cidade(String cidade) {
            clienteDTO.cidade = cidade;
            return this;
        }
        public Builder uf(String uf) {
            clienteDTO.uf = uf;
            return this;
        }
        public Builder dataNascimento(LocalDate dataNascimento) {
            clienteDTO.dataNascimento = dataNascimento;
            return this;
        }
        public Builder ativo(boolean ativo) {
            clienteDTO.ativo = ativo;
            return this;
        }
        public ClienteDTO build() {
            return clienteDTO;
        }
    }
    
    public static Builder builder() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public int getCep() {
        return cep;
    }
    public String getEndereco() {
        return endereco;
    }
    public int getNumero() {
        return numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public String getCidade() {
        return cidade;
    }
    public String getUf() {
        return uf;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public boolean isAtivo() {
        return ativo;
    }
}
