package com.labiv.metazoa.repository;

import com.labiv.metazoa.models.Pessoa;

import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, String> {

}