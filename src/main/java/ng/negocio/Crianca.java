/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ng.negocio;

/**
 *
 * @author narcisogomes
 */
public class Crianca extends Pessoa {

    private Responsavel responsavel;
    private String sexo;

    public Responsavel getResponsavel() {
        return this.responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        if (responsavel == null) {
            throw new IllegalArgumentException("Responsavel não pode ser nulo");
        }
        this.responsavel = responsavel;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo == null || sexo.trim().isEmpty()) {
            throw new IllegalArgumentException("Sexo não pode ser nulo ou vazio");
        }
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if (idade > 10 || idade < 0) {
            throw new IllegalArgumentException("Criança precisa ter de 0 a 10 anos para poder brincar.");
        }
        this.idade = idade;
    }
}
