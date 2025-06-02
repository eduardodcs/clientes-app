package com.bank.clientes.repositories.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cliente")
@Getter
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
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

}
