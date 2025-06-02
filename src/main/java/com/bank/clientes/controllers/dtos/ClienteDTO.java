package com.bank.clientes.controllers.dtos;

import java.time.LocalDate;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

    private Long id;
    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @NotBlank(message = "CPF é obrigatório")
    @CPF(message = "CPF inválido")
    private String cpf;
    @Size(max = 11, message = "O telefone deve ter no máximo 11 dígitos.")
    @Pattern(regexp = "\\d+", message = "O telefone deve conter apenas números.")
    private String telefone;
    @NotNull(message = "CEP é obrigatório")
    @Size(min = 8, max = 8, message = "CEP deve ter exatamente 8 dígitos")
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
