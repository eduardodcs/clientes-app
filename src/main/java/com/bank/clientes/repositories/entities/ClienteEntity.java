package com.bank.clientes.repositories.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
    private Long id;
    private String nome;
    @Column(length = 11, unique = true, nullable = false)
    private String cpf;
    private String telefone;
    @Column(length = 8, nullable = false)
    private int cep;
    private String endereco;
    private int numero;
    private String complemento;
    private String cidade;
    @Column(length = 2, nullable = false)
    private String uf;
    private LocalDate dataNascimento;
    @Column(nullable = false)
    private boolean ativo;
    private LocalDateTime dataHoraCadastro;

    public ClienteEntity() {
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
                .ativo(this.ativo)
                .dataHoraCadastro(this.dataHoraCadastro);
    }
    public static class Builder {
        private ClienteEntity clienteEntity;

        public Builder() {
            clienteEntity = new ClienteEntity();
        }

        public Builder id(Long id) {
            clienteEntity.id = id;
            return this;
        }

        public Builder nome(String nome) {
            clienteEntity.nome = nome;
            return this;
        }

        public Builder cpf(String cpf) {
            clienteEntity.cpf = cpf;
            return this;
        }

        public Builder telefone(String telefone) {
            clienteEntity.telefone = telefone;
            return this;
        }

        public Builder cep(int cep) {
            clienteEntity.cep = cep;
            return this;
        }

        public Builder endereco(String endereco) {
            clienteEntity.endereco = endereco;
            return this;
        }

        public Builder numero(int numero) {
            clienteEntity.numero = numero;
            return this;
        }

        public Builder complemento(String complemento) {
            clienteEntity.complemento = complemento;
            return this;
        }

        public Builder cidade(String cidade) {
            clienteEntity.cidade = cidade;
            return this;
        }

        public Builder uf(String uf) {
            clienteEntity.uf = uf;
            return this;
        }

        public Builder dataNascimento(LocalDate dataNascimento) {
            clienteEntity.dataNascimento = dataNascimento;
            return this;
        }

        public Builder ativo(boolean ativo) {
            clienteEntity.ativo = ativo;
            return this;
        }

        public Builder dataHoraCadastro(LocalDateTime dataHoraCadastro) {
            clienteEntity.dataHoraCadastro = dataHoraCadastro;
            return this;
        }

        public ClienteEntity build() {
            return clienteEntity;
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
    public LocalDateTime getDataHoraCadastro() {
        return dataHoraCadastro;
    }


}
