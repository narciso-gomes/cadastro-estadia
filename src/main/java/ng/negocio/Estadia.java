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
    private Crianca crianca;
    private int tempoUtilizado;
    private double total;
    private final Double VALOR_POR_MINUTO = 1.50;

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
        setTotal();
    }

    public Double getTotal() {
        return total;
    }

    private void setTotal() {
        double valorSemDesconto = VALOR_POR_MINUTO * tempoUtilizado;
        double desconto = 0.0;

        if (tempoUtilizado > 60) {
            desconto = 0.15;
        } else if (tempoUtilizado > 40) {
            desconto = 0.10;
        } else if (tempoUtilizado > 20) {
            desconto = 0.05;
        }

        double valorComDesconto = valorSemDesconto - (valorSemDesconto * desconto);

        total = valorComDesconto;
    }
}
