package Desafio8;

public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$" + salario);
    }

    void calcularAumento(double percentual) {
        double valorAumento = salario * (percentual / 100);
        salario += valorAumento;
        System.out.println("Salário reajustado em " + percentual + "%. \nNovo salário: R$" + salario);
    }

    double calcularSalarioAnual() {
        return salario * 12;
    }
}
