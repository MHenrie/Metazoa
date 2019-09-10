package com.labiv.metazoa.repository;

import com.labiv.metazoa.models.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    Pessoa findById(long id);
}