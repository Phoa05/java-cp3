package br.fiap.cp3.model;

/**
 * Classe que representa um doador que realiza doações para instituições de caridade.
 */
public class Doador {
    private String nome;
    private String cpf;
    private String endereco;
    private String contato;
    private Doacao[] historicoDoacoes;
    private int quantidadeDoacoes;

    private static Doador[] doadores = new Doador[1000];
    private static int quantidadeDoadores = 0;
    /**
     * Construtor da classe Doador.
     *
     * @param nome     nome do doador
     * @param cpf      CPF do doador
     * @param endereco endereço do doador
     * @param contato  informações de contato do doador
     */
    public Doador(String nome, String cpf, String endereco, String contato) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
        this.historicoDoacoes = new Doacao[100];
        this.quantidadeDoacoes = 0;
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

    public Doacao[] getHistoricoDoacoes() {
        return historicoDoacoes;
    }

    public int getQuantidadeDoacoes() {
        return quantidadeDoacoes;
    }
    /**
     * Adiciona uma nova doação ao histórico do doador.
     *
     * @param doacao a doação a ser adicionada ao histórico
     */
    public void adicionarDoacao(Doacao doacao) {
        if (quantidadeDoacoes < historicoDoacoes.length) {
            this.historicoDoacoes[quantidadeDoacoes] = doacao;
            quantidadeDoacoes++;
        } else {
            System.out.println("Capacidade máxima de doações atingida.");
        }
    }

    /**
     * Método estático para cadastrar um novo doador.
     *
     * @param nome     nome do doador
     * @param cpf      CPF do doador
     * @param endereco endereço do doador
     * @param contato  informações de contato do doador
     */
    public static void cadastrarDoador(String nome, String cpf, String endereco, String contato) {
        if (quantidadeDoadores < doadores.length) {
            Doador novoDoador = new Doador(nome, cpf, endereco, contato);
            doadores[quantidadeDoadores] = novoDoador;
            quantidadeDoadores++;
            System.out.println("Doador cadastrado com sucesso.");
        } else {
            System.out.println("Capacidade máxima de doadores atingida.");
        }
    }

    /**
     * Método estático para listar todos os doadores cadastrados.
     */
    public static void listarDoadores() {
        if (quantidadeDoadores == 0) {
            System.out.println("Nenhum doador cadastrado.");
        } else {
            for (int i = 0; i < quantidadeDoadores; i++) {
                Doador doador = doadores[i];
                System.out.println("Nome: " + doador.getNome() + ", CPF: " + doador.getCpf() + ", Endereço: " + doador.getEndereco() + ", Contato: " + doador.getContato());
            }
        }
    }

    /**
     * Método estático para encontrar um doador pelo nome.
     *
     * @param nome o nome do doador a ser encontrado
     * @return o objeto doador se encontrado, caso contrário retorna null
     */
    public static Doador encontrarDoadorPorNome(String nome) {
        for (int i = 0; i < quantidadeDoadores; i++) {
            if (doadores[i].getNome().equals(nome)) {
                return doadores[i];
            }
        }
        return null; // Retorna null se o doador não for encontrado
    }
}
