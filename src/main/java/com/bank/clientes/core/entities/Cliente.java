package com.bank.clientes.core.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Cliente {

    private Long id;
    private String nome;
    private String cpf;
    private int telefone;
    private int cep;
    private String endereco;
    private int numero;
    private String complemento;
    private String cidade;
    private String uf;
    private LocalDate dataNascimento;
    private boolean ativo = true;
    private LocalDateTime dataHoraCadastro = LocalDateTime.now();

    public Cliente() {
        // Default constructor
    }

    public static class Builder {
        private Cliente cliente;

        public Builder() {
            cliente = new Cliente();
        }

        public Builder id(Long id) {
            cliente.id = id;
            return this;
        }

        public Builder nome(String nome) {
            cliente.nome = nome;
            return this;
        }

        public Builder cpf(String cpf) {
            cliente.cpf = cpf;
            return this;
        }

        public Builder telefone(int telefone) {
            cliente.telefone = telefone;
            return this;
        }

        public Builder cep(int cep) {
            cliente.cep = cep;
            return this;
        }

        public Builder endereco(String endereco) {
            cliente.endereco = endereco;
            return this;
        }

        public Builder numero(int numero) {
            cliente.numero = numero;
            return this;
        }

        public Builder complemento(String complemento) {
            cliente.complemento = complemento;
            return this;
        }

        public Builder cidade(String cidade) {
            cliente.cidade = cidade;
            return this;
        }

        public Builder uf(String uf) {
            cliente.uf = uf;
            return this;
        }

        public Builder dataNascimento(LocalDate dataNascimento) {
            cliente.dataNascimento = dataNascimento;
            return this;
        }

        public Cliente build() {
            return cliente;
        }
    }

    public static Builder builder() {
        return new Builder();
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
                .dataNascimento(this.dataNascimento);
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
    public int getTelefone() {
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
    public LocalDateTime getDataHoraCadastro() {
        return dataHoraCadastro;
    }
}
