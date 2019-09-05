package com.labiv.metazoa.models;

public class Instituicao extends Pessoa {

    private static final long serialVersionUID = 1L;

    private String cnpj;
    private String contaBancaria;

    public Instituicao(String nome, String telefone, String email, String senha, String estado, String cidade,
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