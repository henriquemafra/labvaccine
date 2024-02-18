package com.devinpharmacy.labvaccine.entidades;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Cliente extends Pessoa {

    @Column(nullable = false)
    private String contatoEmergencia;

    @Column
    private String alergias;

    @Column
    private String convenio;

    @Column
    private String numeroCarteiraConvenio;

    @Column
    private LocalDate validadeCarteiraConvenio;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id", referencedColumnName = "id")
    private Endereco endereco;

    public String getContatoEmergencia() {
        return contatoEmergencia;
    }

    public void setContatoEmergencia(String contatoEmergencia) {
        this.contatoEmergencia = contatoEmergencia;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getNumeroCarteiraConvenio() {
        return numeroCarteiraConvenio;
    }

    public void setNumeroCarteiraConvenio(String numeroCarteiraConvenio) {
        this.numeroCarteiraConvenio = numeroCarteiraConvenio;
    }

    public LocalDate getValidadeCarteiraConvenio() {
        return validadeCarteiraConvenio;
    }

    public void setValidadeCarteiraConvenio(LocalDate validadeCarteiraConvenio) {
        this.validadeCarteiraConvenio = validadeCarteiraConvenio;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
