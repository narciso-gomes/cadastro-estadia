package ng.negocio;

/**
 * Representa um objeto Responsavel com informações como nome, CPF, telefone,
 * email, endereco e idade.
 *
 * @author narcisogomes
 * @version 1.0
 */
public class Responsavel extends Pessoa {

    private String cpf;
    private String telefone;
    private String email;
    private String endereco;

    /**
     * Obtém o nome do responsável.
     *
     * @return - nome do responsável.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do responsável.
     *
     * @param nome - novo nome do responsável.
     */
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    /**
     * Obtém o CPF do responsável.
     *
     * @return - CPF do responsável.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Define o CPF do responsável.
     *
     * @param cpf - novo CPF do responsável.
     */
    public void setCpf(String cpf) {
        if (cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("CPF não pode ser nulo ou vazio.");
        }
        this.cpf = cpf;
    }

    /**
     * Obtém o telefone do responsável.
     *
     * @return - telefone do responsável.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone do responsável.
     *
     * @param telefone - novo telefone do responsável.
     */
    public void setTelefone(String telefone) {
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Telefone não pode ser nulo ou vazio.");
        }
        this.telefone = telefone;
    }

    /**
     * Obtém o email do responsável.
     *
     * @return - email do responsável.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email do responsável.
     *
     * @param email - novo email do responsável.
     */
    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email não pode ser nulo ou vazio.");
        }
        this.email = email;
    }

    /**
     * Obtém o endereço do responsável.
     *
     * @return - endereço do responsável.
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Define o endereço do responsável.
     *
     * @param endereco - novo endereço do responsável.
     */
    public void setEndereco(String endereco) {
        if (endereco == null || endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("Endereco não pode ser nulo ou vazio.");
        }
        this.endereco = endereco;
    }

    /**
     * Obtém a idade do responsável.
     *
     * @return - idade do responsável.
     */
    public Integer getIdade() {
        return idade;
    }

    /**
     * Define a idade do responsável.
     *
     * @param idade - nova idade do responsável.
     */
    public void setIdade(Integer idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Responsável precisar ser maior de 18 anos.");
        }
        this.idade = idade;
    }
}
