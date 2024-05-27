package br.fiap.cp3.model;
/**
 * Classe que representa um voluntário.
 */
public class Voluntario {
    private String nome; // Nome do voluntário
    private String cpf; // CPF do voluntário
    private String endereco; // Endereço do voluntário
    private String contato; // Informações de contato do voluntário

    private static Voluntario[] voluntarios = new Voluntario[1000]; // Array para armazenar todos os voluntários
    private static int quantidadeVoluntarios = 0; // Contador para controlar o número de voluntários cadastrados

    /**
     * Construtor da classe Voluntario.
     *
     * @param nome      nome do voluntário
     * @param cpf       CPF do voluntário
     * @param endereco  endereço do voluntário
     * @param contato   informações de contato do voluntário
     */
    public Voluntario(String nome, String cpf, String endereco, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    /**
     * Método estático para cadastrar um novo voluntário.
     *
     * @param nome      nome do voluntário
     * @param cpf       CPF do voluntário
     * @param endereco  endereço do voluntário
     * @param contato   informações de contato do voluntário
     */
    public static void cadastrarVoluntario(String nome, String cpf, String endereco, String contato) {
        if (quantidadeVoluntarios < voluntarios.length) {
            Voluntario novoVoluntario = new Voluntario(nome, cpf, endereco, contato);
            voluntarios[quantidadeVoluntarios] = novoVoluntario;
            quantidadeVoluntarios++;
            System.out.println("Voluntário cadastrado com sucesso.");
        } else {
            System.out.println("Capacidade máxima de voluntários atingida.");
        }
    }

    /**
     * Método estático para listar todos os voluntários cadastrados.
     */
    public static void listarVoluntarios() {
        if (quantidadeVoluntarios == 0) {
            System.out.println("Nenhum voluntário cadastrado.");
        } else {
            for (int i = 0; i < quantidadeVoluntarios; i++) {
                Voluntario voluntario = voluntarios[i];
                System.out.println("Nome: " + voluntario.getNome() + ", CPF: " + voluntario.getCpf() + ", Endereço: " + voluntario.getEndereco() + ", Contato: " + voluntario.getContato());
            }
        }
    }
}