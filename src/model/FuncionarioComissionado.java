package model;

public class FuncionarioComissionado extends Funcionario {

    private double vendas;
    private double percentualComissao;

    public FuncionarioComissionado(
            int matricula,
            String nome,
            double vendas,
            double percentualComissao) {

        super(matricula, nome);

        this.vendas = vendas;
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularExtra() {

        return (vendas * percentualComissao) / 100;
    }
}