package model;

public class FuncionarioProducao extends Funcionario {

    private int quantidadeProduzida;
    private double valorPorPeca;

    public FuncionarioProducao(
            int matricula,
            String nome,
            int quantidadeProduzida,
            double valorPorPeca) {

        super(matricula, nome);

        this.quantidadeProduzida = quantidadeProduzida;
        this.valorPorPeca = valorPorPeca;
    }

    @Override
    public double calcularExtra() {

        return quantidadeProduzida * valorPorPeca;
    }
}