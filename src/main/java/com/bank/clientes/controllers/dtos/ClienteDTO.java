package com.bank.clientes.controllers.dtos;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

// import com.fasterxml.jackson.annotation.JsonSubTypes.Type; // Removed unused and incorrect import
import jakarta.validation.constraints.Pattern;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

    private Long id;
    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @NotBlank(message = "CPF é obrigatório")
    @CPF(message = "CPF inválido")
    private String cpf;
    private int telefone;
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

}
