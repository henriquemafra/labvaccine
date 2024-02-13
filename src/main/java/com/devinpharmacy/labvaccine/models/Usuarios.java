package com.devinpharmacy.labvaccine.models;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_USUARIOS")
@Inheritance(strategy = InheritanceType.JOINED)

public class Usuarios extends Pessoa {
    private String crfUf;
    private Date dataFormacao;
    private String senha;
    

    

    public Usuarios(long id, String nomeCompleto, String genero, Date dataNascimento, String cpf, String rg,
            String estadoCivil, String telefone, String email, String naturalidade, String crfUf, Date dataFormacao,
            String senha) {
        super(id, nomeCompleto, genero, dataNascimento, cpf, rg, estadoCivil, telefone, email, naturalidade);
        this.crfUf = crfUf;
        this.dataFormacao = dataFormacao;
        this.senha = senha;
    }

    public String getCrfUf() {
        return crfUf;
    }

    public void setCrfUf(String crfUf) {
        this.crfUf = crfUf;
    }

    public Date getDataFormacao() {
        return dataFormacao;
    }

    public void setDataFormacao(Date dataFormacao) {
        this.dataFormacao = dataFormacao;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
