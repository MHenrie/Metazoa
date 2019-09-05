package com.labiv.metazoa.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String email;

    private String nome;
    private String telefone;
    private String senha;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numeroResidencia;

    public Pessoa(String nome, String telefone, String email, String senha, String estado, String cidade, String bairro,
            String rua, int numeroResidencia) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numeroResidencia = numeroResidencia;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getEstado() {
        return this.estado;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getRua() {
        return this.rua;
    }

    public int getNumeroResidencia() {
        return this.numeroResidencia;
    }

}