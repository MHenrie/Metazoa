package com.labiv.metazoa.controllers;

import java.util.List;

import javax.validation.Valid;

import com.labiv.metazoa.models.Pessoa;
import com.labiv.metazoa.repository.PessoaRepository;

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
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @GetMapping("/pessoas")
    public List<Pessoa> listaPessoas() {
        return repository.findAll();
    }

    @GetMapping("/pessoa/{id}")
    public Pessoa retornaPessoaId(@PathVariable(value = "id") long id) {
        return repository.findById(id);
    }

    @PostMapping("/pessoa")
    public Pessoa salvaPessoa(@RequestBody @Valid Pessoa pessoa) {
        return repository.save(pessoa);
    }

    @PutMapping("/pessoa")
    public Pessoa atualizaPessoa(@RequestBody @Valid Pessoa pessoa) {
        return repository.save(pessoa);
    }

    @DeleteMapping("/pessoa")
    public void deletaPessoa(@RequestBody Pessoa pessoa) {
        repository.delete(pessoa);
    }
}