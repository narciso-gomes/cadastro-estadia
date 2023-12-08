/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ng.negocio;

/**
 * Representa uma criança com informações como nome, idade, sexo e responsável.
 * 
 * @author narcisogomes
 * @version 1.0
 */
public class Crianca extends Pessoa {

    private Responsavel responsavel;
    private String sexo;

    /**
     * Obtém o responsável da criança.
     * 
     * @return O responsável da criança.
     */
    public Responsavel getResponsavel() {
        return this.responsavel;
    }

    /**
     * Define o responsável da criança.
     * 
     * @param responsavel O novo responsável da criança.
     * @throws IllegalArgumentException Se o responsável fornecido for nulo.
     */
    public void setResponsavel(Responsavel responsavel) {
        if (responsavel == null) {
            throw new IllegalArgumentException("Responsavel não pode ser nulo");
        }
        this.responsavel = responsavel;
    }

    /**
     * Obtém o sexo da criança.
     * 
     * @return O sexo da criança.
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define o sexo da criança.
     * 
     * @param sexo O novo sexo da criança.
     * @throws IllegalArgumentException Se o sexo fornecido for nulo ou vazio.
     */
    public void setSexo(String sexo) {
        if (sexo == null || sexo.trim().isEmpty()) {
            throw new IllegalArgumentException("Sexo não pode ser nulo ou vazio");
        }
        this.sexo = sexo;
    }

    /**
     * Obtém o nome da criança.
     * 
     * @return O nome da criança.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da criança.
     * 
     * @param nome O novo nome da criança.
     * @throws IllegalArgumentException Se o nome fornecido for nulo ou vazio.
     */
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    /**
     * Obtém a idade da criança.
     * 
     * @return A idade da criança.
     */
    public Integer getIdade() {
        return idade;
    }

    /**
     * Define a idade da criança.
     * 
     * @param idade A nova idade da criança.
     * @throws IllegalArgumentException Se a idade fornecida estiver fora do intervalo de 0 a 10 anos.
     */
    public void setIdade(Integer idade) {
        if (idade < 0 || idade > 10) {
            throw new IllegalArgumentException("Criança precisa ter de 0 a 10 anos para poder brincar.");
        }
        this.idade = idade;
    }
}
