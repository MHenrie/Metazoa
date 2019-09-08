package com.labiv.metazoa.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class PessoaJuridica extends Pessoa {

    private static final long serialVersionUID = 1L;

    @NotBlank
    @Column(unique = true)
    private String cnpj;
    @NotBlank
    private String contaBancaria;

    public PessoaJuridica() {

    }

    public PessoaJuridica(String nome, String telefone, String email, String senha, String estado, String cidade,
            String bairro, String rua, int numeroResidencia, String cnpj, String contaBancaria) {

        super(nome, telefone, email, senha, estado, cidade, bairro, rua, numeroResidencia);
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