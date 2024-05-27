package br.fiap.cp3.model;

/**
 * Classe que representa uma doação realizada por um doador para uma instituição de caridade.
 */
public class Doacao {
    private Doador doador;
    private InstituicaoCaridade instituicao;
    private String tipo;
    private double valor;
    private String data;

    private static Doacao[] doacoes = new Doacao[1000];
    private static int quantidadeDoacoes = 0;

    /**
     * Construtor da classe Doacao.
     *
     * @param doador     o doador que realizou a doação
     * @param instituicao a instituição de caridade que recebeu a doação
     * @param tipo       o tipo de doação (valor ou material)
     * @param valor      o valor da doação (se for do tipo "valor")
     * @param data       a data em que a doação foi realizada
     */
    public Doacao(Doador doador, InstituicaoCaridade instituicao, String tipo, double valor, String data) {
        this.doador = doador;
        this.instituicao = instituicao;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }

    /**
     * Obtém o doador associado à doação.
     *
     * @return o doador que realizou a doação
     */
    public Doador getDoador() {
        return doador;
    }

    /**
     * Obtém a instituição de caridade associada à doação.
     *
     * @return a instituição de caridade que recebeu a doação
     */
    public InstituicaoCaridade getInstituicao() {
        return instituicao;
    }

    /**
     * Obtém o tipo da doação.
     *
     * @return o tipo de doação (valor ou material)
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Obtém o valor da doação.
     *
     * @return o valor da doação
     */
    public double getValor() {
        return valor;
    }

    /**
     * Obtém a data da doação.
     *
     * @return a data em que a doação foi realizada
     */
    public String getData() {
        return data;
    }

    /**
     * Método estático para cadastrar uma nova doação.
     *
     * @param doador     o doador que realizou a doação
     * @param instituicao a instituição de caridade que recebeu a doação
     * @param tipo       o tipo de doação (valor ou material)
     * @param valor      o valor da doação (se for do tipo "valor")
     * @param data       a data em que a doação foi realizada
     */
    public static void cadastrarDoacao(Doador doador, InstituicaoCaridade instituicao, String tipo, double valor, String data) {
        if (quantidadeDoacoes < doacoes.length) {
            Doacao novaDoacao = new Doacao(doador, instituicao, tipo, valor, data);
            doacoes[quantidadeDoacoes] = novaDoacao;
            quantidadeDoacoes++;
            doador.adicionarDoacao(novaDoacao);
            System.out.println("Doação cadastrada com sucesso.");
        } else {
            System.out.println("Capacidade máxima de doações atingida.");
        }
    }
}
