package com.labiv.metazoa.controllers;

import java.util.List;

import javax.validation.Valid;

import com.labiv.metazoa.models.Instituicao;
import com.labiv.metazoa.repository.InstituicaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InstituicaoController {

    @Autowired
    private InstituicaoRepository repository;

    @GetMapping("/instituicoes")
    public List<Instituicao> listaInstituicoes() {
        return repository.findAll();
    }

    @GetMapping("/instituicao/{id}")
    public Instituicao retornaInstituicaoId(@PathVariable(value = "id") long id) {
        return repository.findById(id);
    }

    @PostMapping("/instituicao")
    public Instituicao salvaInstituicao(@RequestBody @Valid Instituicao instituicao) {
        return repository.save(instituicao);
    }

    @PutMapping("/instituicao")
    public Instituicao atualizaInstituicao(@RequestBody @Valid Instituicao instituicao) {
        return repository.save(instituicao);
    }

    @DeleteMapping("/instituicao")
    public void deletaInstituicao(@RequestBody Instituicao instituicao) {
        repository.delete(instituicao);
    }
}