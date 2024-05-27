package br.fiap.cp3.model;

/**
 * Classe que representa uma instituição de caridade.
 */
public class InstituicaoCaridade {
    private String nome; // Nome da instituição de caridade
    private String cnpj; // CNPJ da instituição de caridade
    private String endereco; // Endereço da instituição de caridade
    private String contato; // Informações de contato da instituição de caridade
    private String areaAtuacao; // Area de atuação da instituição de caridade

    private static InstituicaoCaridade[] instituicoes = new InstituicaoCaridade[1000]; // Array para armazenar todas as instituições de caridade
    private static int quantidadeInstituicoes = 0; // Contador para controlar o número de instituições de caridade cadastradas

    /**
     * Construtor da classe InstituicaoCaridade.
     *
     * @param nome         nome da instituição de caridade
     * @param cnpj         CNPJ da instituição de caridade
     * @param endereco     endereço da instituição de caridade
     * @param contato      informações de contato da instituição de caridade
     * @param areaAtuacao  área de atuação da instituição de caridade
     */
    public InstituicaoCaridade(String nome, String cnpj, String endereco, String contato, String areaAtuacao) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.contato = contato;
        this.areaAtuacao = areaAtuacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    /**
     * Método estático para cadastrar uma nova instituição de caridade.
     *
     * @param nome         nome da instituição de caridade
     * @param cnpj         CNPJ da instituição de caridade
     * @param endereco     endereço da instituição de caridade
     * @param contato      informações de contato da instituição de caridade
     * @param areaAtuacao  área de atuação da instituição de caridade
     */
    public static void cadastrarInstituicao(String nome, String cnpj, String endereco, String contato, String areaAtuacao) {
        if (quantidadeInstituicoes < instituicoes.length) {
            InstituicaoCaridade novaInstituicao = new InstituicaoCaridade(nome, cnpj, endereco, contato, areaAtuacao);
            instituicoes[quantidadeInstituicoes] = novaInstituicao;
            quantidadeInstituicoes++;
            System.out.println("Instituição de Caridade cadastrada com sucesso.");
        } else {
            System.out.println("Capacidade máxima de instituições atingida.");
        }
    }

    /**
     * Método estático para listar todas as instituições de caridade cadastradas.
     */
    public static void listarInstituicoes() {
        if (quantidadeInstituicoes == 0) {
            System.out.println("Nenhuma instituição cadastrada.");
        } else {
            for (int i = 0; i < quantidadeInstituicoes; i++) {
                InstituicaoCaridade instituicao = instituicoes[i];
                System.out.println("Nome: " + instituicao.getNome() + ", CNPJ: " + instituicao.getCnpj() + ", Endereço: " + instituicao.getEndereco() + ", Contato: " + instituicao.getContato() + ", Area de Atuação: " + instituicao.getAreaAtuacao());
            }
        }
    }

    /**
     * Método estático para encontrar uma instituição de caridade pelo nome.
     *
     * @param nome o nome da instituição de caridade a ser encontrada
     * @return o objeto instituição de caridade se encontrado, caso contrário retorna null
     */
    public static InstituicaoCaridade encontrarInstituicaoPorNome(String nome) {
        for (int i = 0; i < quantidadeInstituicoes; i++) {
            if (instituicoes[i].getNome().equals(nome)) {
                return instituicoes[i];
            }
        }
        return null; // Retorna null se a instituição de caridade não for encontrada
    }
}