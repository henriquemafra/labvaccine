package com.devinpharmacy.labvaccine.models;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_VACINAS")
public class Vacinas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long identificador;
    
    private String nomeVacina;
    
    private Date dataHoraAdministracao;
    
    private String tipoVacina;
    
    private int quantidade;
    
    private String observacoes;
    
    private Long identificadorCliente;
    
    private Long identificadorFarmaceutico;


    public Vacinas(Long identificador, String nomeVacina, Date dataHoraAdministracao, String tipoVacina, int quantidade,
            String observacoes, Long identificadorCliente, Long identificadorFarmaceutico) {
        this.identificador = identificador;
        this.nomeVacina = nomeVacina;
        this.dataHoraAdministracao = dataHoraAdministracao;
        this.tipoVacina = tipoVacina;
        this.quantidade = quantidade;
        this.observacoes = observacoes;
        this.identificadorCliente = identificadorCliente;
        this.identificadorFarmaceutico = identificadorFarmaceutico;
    }


    public Long getIdentificador() {
        return identificador;
    }


    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }


    public String getNomeVacina() {
        return nomeVacina;
    }


    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }


    public Date getDataHoraAdministracao() {
        return dataHoraAdministracao;
    }


    public void setDataHoraAdministracao(Date dataHoraAdministracao) {
        this.dataHoraAdministracao = dataHoraAdministracao;
    }


    public String getTipoVacina() {
        return tipoVacina;
    }


    public void setTipoVacina(String tipoVacina) {
        this.tipoVacina = tipoVacina;
    }


    public int getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    public String getObservacoes() {
        return observacoes;
    }


    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }


    public Long getIdentificadorCliente() {
        return identificadorCliente;
    }


    public void setIdentificadorCliente(Long identificadorCliente) {
        this.identificadorCliente = identificadorCliente;
    }


    public Long getIdentificadorFarmaceutico() {
        return identificadorFarmaceutico;
    }


    public void setIdentificadorFarmaceutico(Long identificadorFarmaceutico) {
        this.identificadorFarmaceutico = identificadorFarmaceutico;
    }


}
