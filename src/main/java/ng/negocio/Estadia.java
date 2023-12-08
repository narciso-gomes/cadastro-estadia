/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ng.negocio;

/**
 * Representa uma estadia de uma criança e controla o tempo utilizado e o custo associado.
 * 
 * @author narcisogomes
 */
public class Estadia {
    private Crianca crianca;
    private int tempoUtilizado;
    private double total;
    private final Double VALOR_POR_MINUTO = 1.50;

    /**
     * Obtém a criança associada a esta estadia.
     * 
     * @return A criança associada a esta estadia.
     */
    public Crianca getCrianca() {
        return crianca;
    }

    /**
     * Define a criança associada a esta estadia.
     * 
     * @param crianca A criança a ser associada a esta estadia.
     * @throws IllegalArgumentException Se a criança fornecida for nula.
     */
    public void setCrianca(Crianca crianca) {
        if (crianca == null) {
            throw new IllegalArgumentException("Criança não pode ser nula");
        }
        this.crianca = crianca;
    }

    /**
     * Obtém o tempo utilizado nesta estadia.
     * 
     * @return O tempo utilizado nesta estadia.
     */
    public Integer getTempoUtilizado() {
        return tempoUtilizado;
    }

    /**
     * Define o tempo utilizado nesta estadia e calcula o custo total.
     * 
     * @param tempoUtilizado O tempo utilizado nesta estadia.
     */
    public void setTempoUtilizado(Integer tempoUtilizado) {
        this.tempoUtilizado = tempoUtilizado;
        setTotal();
    }

    /**
     * Obtém o custo total desta estadia.
     * 
     * @return O custo total desta estadia.
     */
    public Double getTotal() {
        return total;
    }

    /**
     * Calcula o custo total com base no tempo utilizado, aplicando descontos conforme necessário.
     */
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
