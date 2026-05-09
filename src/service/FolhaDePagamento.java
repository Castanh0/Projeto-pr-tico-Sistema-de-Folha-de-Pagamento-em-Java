package service;

import java.util.ArrayList;

import model.Funcionario;

public class FolhaDePagamento {

    private ArrayList<Funcionario> funcionarios;

    public FolhaDePagamento() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void gerarFolha() {

        System.out.println("\n===== FOLHA DE PAGAMENTO =====");

        System.out.println(
                "Total de funcionários: "
                        + funcionarios.size());

        for (Funcionario f : funcionarios) {

            System.out.println("\n----------------------");

            System.out.println(
                    "Nome: " + f.getNome());

            System.out.println(
                    "Matrícula: " + f.getMatricula());

            System.out.printf(
                    "Salário Base: R$ %.2f%n",
                    2000.0);

            System.out.printf(
                    "Extras: R$ %.2f%n",
                    f.calcularExtra());

            System.out.printf(
                    "Salário Final: R$ %.2f%n",
                    f.calcularSalario());
        }
    }
}