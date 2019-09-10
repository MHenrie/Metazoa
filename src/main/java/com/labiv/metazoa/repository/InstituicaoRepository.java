package com.labiv.metazoa.repository;

import com.labiv.metazoa.models.Instituicao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InstituicaoRepository extends JpaRepository<Instituicao, Long> {

    Instituicao findById(long id);
}