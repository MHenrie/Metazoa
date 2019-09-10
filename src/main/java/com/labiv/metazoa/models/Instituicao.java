package com.labiv.metazoa.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Instituicao extends Pessoa {

    private static final long serialVersionUID = 1L;

    @NotBlank
    @Column(unique = true)
    private String cnpj;
    private String contaBancaria;

    public Instituicao() {

    }

    public Instituicao(String nome, String telefone, String email, String senha, String estado, String cidade,
            String bairro, String rua, int numeroEndereco, String complemento, String cnpj, String contaBancaria) {

        super(nome, telefone, email, senha, estado, cidade, bairro, rua, numeroEndereco, complemento);
        this.cnpj = cnpj;
        this.contaBancaria = contaBancaria;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public String getContaBancaria() {
        return this.contaBancaria;
    }

}