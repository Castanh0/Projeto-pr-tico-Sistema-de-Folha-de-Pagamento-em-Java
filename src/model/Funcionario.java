package model;

public class Funcionario {

    private int matricula;
    private String nome;

    protected static final double SALARIO_BASE = 2000;

    public Funcionario(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcularExtra() {
        return 0;
    }

    public double calcularSalario() {
        return SALARIO_BASE + calcularExtra();
    }
}