package com.devinpharmacy.labvaccine.entidades;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Usuario extends Pessoa {

    @Column(nullable = false)
    private String crfUf;

    @Column(nullable = false)
    private LocalDate dataFormacao;

    @Column(nullable = false)
    private String senha;

    public String getCrfUf() {
        return crfUf;
    }

    public void setCrfUf(String crfUf) {
        this.crfUf = crfUf;
    }

    public LocalDate getDataFormacao() {
        return dataFormacao;
    }

    public void setDataFormacao(LocalDate dataFormacao) {
        this.dataFormacao = dataFormacao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}

