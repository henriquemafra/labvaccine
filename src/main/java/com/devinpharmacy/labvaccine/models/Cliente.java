package com.devinpharmacy.labvaccine.models;

import java.util.Date;
import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CLIENTE")
public class Cliente extends Pessoa {
    private String contatoEmergencia;

    @Nullable
    private String listaAlergias;

    @Nullable
    private String convenio;

    @Nullable
    private String numeroCarteiraConvenio;

    @Nullable
    private Date validadeCarteiraConvenio;

    @ManyToOne
    private Endereco endereco;

    public Cliente(long id, String nomeCompleto, String genero, Date dataNascimento, String cpf, String rg,
            String estadoCivil, String telefone, String email, String naturalidade, String contatoEmergencia,
            String listaAlergias, String convenio, String numeroCarteiraConvenio, Date validadeCarteiraConvenio,
            Endereco endereco) {
        super(id, nomeCompleto, genero, dataNascimento, cpf, rg, estadoCivil, telefone, email, naturalidade);
        this.contatoEmergencia = contatoEmergencia;
        this.listaAlergias = listaAlergias;
        this.convenio = convenio;
        this.numeroCarteiraConvenio = numeroCarteiraConvenio;
        this.validadeCarteiraConvenio = validadeCarteiraConvenio;
        this.endereco = endereco;
    }

    public String getContatoEmergencia() {
        return contatoEmergencia;
    }

    public void setContatoEmergencia(String contatoEmergencia) {
        this.contatoEmergencia = contatoEmergencia;
    }

    public String getListaAlergias() {
        return listaAlergias;
    }

    public void setListaAlergias(String listaAlergias) {
        this.listaAlergias = listaAlergias;
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

    public Date getValidadeCarteiraConvenio() {
        return validadeCarteiraConvenio;
    }

    public void setValidadeCarteiraConvenio(Date validadeCarteiraConvenio) {
        this.validadeCarteiraConvenio = validadeCarteiraConvenio;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
