package app;

import java.util.Scanner;

import model.Funcionario;
import model.FuncionarioComissionado;
import model.FuncionarioProducao;

import service.FolhaDePagamento;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FolhaDePagamento folha = new FolhaDePagamento();

        int opcao;

        do {

            mostrarMenu();

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    cadastrarFuncionarioPadrao(sc, folha);
                    break;

                case 2:
                    cadastrarFuncionarioComissionado(sc, folha);
                    break;

                case 3:
                    cadastrarFuncionarioProducao(sc, folha);
                    break;

                case 4:
                    folha.gerarFolha();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }

    public static void mostrarMenu() {

        System.out.println("\n===== MENU =====");
        System.out.println("1 - Cadastrar Funcionário Padrão");
        System.out.println("2 - Cadastrar Funcionário Comissionado");
        System.out.println("3 - Cadastrar Funcionário Produção");
        System.out.println("4 - Gerar Folha de Pagamento");
        System.out.println("0 - Sair");

        System.out.print("Escolha uma opção: ");
    }

    public static void cadastrarFuncionarioPadrao(
            Scanner sc,
            FolhaDePagamento folha) {

        System.out.print("Matrícula: ");
        int matricula = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        Funcionario funcionario =
                new Funcionario(matricula, nome);

        folha.adicionarFuncionario(funcionario);

        System.out.println("Funcionário cadastrado.");
    }

    public static void cadastrarFuncionarioComissionado(
            Scanner sc,
            FolhaDePagamento folha) {

        System.out.print("Matrícula: ");
        int matricula = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        double vendas = lerValorPositivo(
                sc,
                "Informe o valor das vendas: ");

        double percentual = lerValorPositivo(
                sc,
                "Informe o percentual da comissão: ");

        FuncionarioComissionado funcionario =
                new FuncionarioComissionado(
                        matricula,
                        nome,
                        vendas,
                        percentual);

        folha.adicionarFuncionario(funcionario);

        System.out.println("Funcionário comissionado cadastrado.");
    }

    public static void cadastrarFuncionarioProducao(
            Scanner sc,
            FolhaDePagamento folha) {

        System.out.print("Matrícula: ");
        int matricula = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        int quantidadeProduzida =
                (int) lerValorPositivo(
                        sc,
                        "Quantidade produzida: ");

        double valorPorPeca =
                lerValorPositivo(
                        sc,
                        "Valor por peça: ");

        FuncionarioProducao funcionario =
                new FuncionarioProducao(
                        matricula,
                        nome,
                        quantidadeProduzida,
                        valorPorPeca);

        folha.adicionarFuncionario(funcionario);

        System.out.println("Funcionário produção cadastrado.");
    }

    public static double lerValorPositivo(
            Scanner sc,
            String mensagem) {

        double valor;

        do {

            System.out.print(mensagem);

            valor = sc.nextDouble();

            if (valor < 0) {
                System.out.println("Valor inválido.");
            }

        } while (valor < 0);

        return valor;
    }
}