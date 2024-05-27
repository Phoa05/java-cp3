import br.fiap.cp3.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Cadastrar");
        System.out.println("2. Fazer uma doação");
        System.out.println("3. Visualizar");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("O que deseja cadastrar?");
                System.out.println("1. Doadores");
                System.out.println("2. Voluntários");
                System.out.println("3. Instituições de Caridade");
                int cOption = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                switch (cOption) {
                    case 1:
                        System.out.println("Digite o nome do doador:");
                        String nomeDoador = scanner.nextLine();
                        System.out.println("CPF do doador:");
                        String cpfDoador = scanner.nextLine();
                        System.out.println("Endereço do doador:");
                        String enderecoDoador = scanner.nextLine();
                        System.out.println("Contato do doador:");
                        String contatoDoador = scanner.nextLine();
                        Doador.cadastrarDoador(nomeDoador, cpfDoador, enderecoDoador, contatoDoador);
                        break;
                    case 2:
                        System.out.println("Digite o nome do voluntário:");
                        String nomeVoluntario = scanner.nextLine();
                        System.out.println("CPF do voluntário:");
                        String cpfVoluntario = scanner.nextLine();
                        System.out.println("Endereço do voluntário:");
                        String enderecoVoluntario = scanner.nextLine();
                        System.out.println("Contato do voluntário:");
                        String contatoVoluntario = scanner.nextLine();
                        System.out.println("Disponibilidade de horário:");
                        String dispHorario = scanner.nextLine();
                        System.out.println("Habilidades do voluntário:");
                        String habilidadesVoluntario = scanner.nextLine();
                        Voluntario.cadastrarVoluntario(nomeVoluntario, cpfVoluntario, enderecoVoluntario, contatoVoluntario);
                        break;
                    case 3:
                        System.out.println("Digite o nome da instituição:");
                        String nomeInstituicao = scanner.nextLine();
                        System.out.println("CNPJ da instituição:");
                        String cnpjInstituicao = scanner.nextLine();
                        System.out.println("Endereço da instituição:");
                        String enderecoInstituicao = scanner.nextLine();
                        System.out.println("Contato da instituição:");
                        String contatoInstituicao = scanner.nextLine();
                        System.out.println("Area de atuação da instituição:");
                        String areaAtuacaoInstituicao = scanner.nextLine();
                        InstituicaoCaridade.cadastrarInstituicao(nomeInstituicao, cnpjInstituicao, enderecoInstituicao, contatoInstituicao, areaAtuacaoInstituicao);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
                break;
            case 2:
                System.out.println("Digite o nome do doador:");
                String nomeDoadorDoacao = scanner.nextLine();
                System.out.println("Digite a qual instituição você deseja mandar:");
                String instituicaoDoacao = scanner.nextLine();
                System.out.println("Deseja doar um valor ou um material?");
                String tipoDoacao = scanner.nextLine();
                if (tipoDoacao.equals("valor")) {
                    System.out.println("Digite o valor:");
                    double valorDoacao = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite a data da doação:");
                    String dataDoacao = scanner.nextLine();
                    Doador doador = Doador.encontrarDoadorPorNome(nomeDoadorDoacao);
                    InstituicaoCaridade instituicao = InstituicaoCaridade.encontrarInstituicaoPorNome(instituicaoDoacao);
                    Doacao.cadastrarDoacao(doador, instituicao, tipoDoacao, valorDoacao, dataDoacao);
                } else {
                    System.out.println("Agende com a instituição sua doação.");
                }
                break;
            case 3:
                System.out.println("Qual tipo de informação você deseja visualizar?");
                System.out.println("1. Doadores");
                System.out.println("2. Voluntários");
                System.out.println("3. Instituições de Caridade");
                int vOption = scanner.nextInt();
                scanner.nextLine();

                switch (vOption) {
                    case 1:
                        System.out.println("Lista de Doadores:");
                        Doador.listarDoadores();
                        break;
                    case 2:
                        System.out.println("Lista de Voluntários:");
                        Voluntario.listarVoluntarios();
                        break;
                    case 3:
                        System.out.println("Lista de Instituições de Caridade:");
                        InstituicaoCaridade.listarInstituicoes();
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
