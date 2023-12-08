/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ng.negocio;

/**
 *
 * @author narcisogomes
 */
public class Estadia {

    private Responsavel responsavel;
    private Crianca crianca;
    private Integer tempoUtilizado;

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        if (responsavel == null) {
            throw new IllegalArgumentException("Responsavel não pode ser nulo");
        }
        this.responsavel = responsavel;
    }

    public Crianca getCrianca() {
        return crianca;
    }

    public void setCrianca(Crianca crianca) {
        if (crianca == null) {
            throw new IllegalArgumentException("Responsavel não pode ser nulo");
        }
        this.crianca = crianca;
    }

    public Integer getTempoUtilizado() {
        return tempoUtilizado;
    }

    public void setTempoUtilizado(Integer tempoUtilizado) {
        this.tempoUtilizado = tempoUtilizado;
    }

}
