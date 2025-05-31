package com.bank.clientes.repositories.jpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.bank.clientes.repositories.entities.ClienteEntity;

@Repository
public interface IClienteRepository extends JpaRepository<ClienteEntity, Long> {

    Optional<ClienteEntity> findByCpf(String cpf);

    @Modifying
    @Query("UPDATE ClienteEntity c SET c.ativo = CASE WHEN c.ativo = true THEN false ELSE true END WHERE c.id = :id")
    void ativarInativar(@Param("id") Long id);

}