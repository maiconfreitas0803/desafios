package Desafio8;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nDesafio 8:");

        Funcionario funcionarios = new Funcionario("Adriano", "Dev", 15000);

        funcionarios.mostrarDados();

        System.out.println("\nSalário anual antes do aumento: R$" + funcionarios.calcularSalarioAnual());

        funcionarios.calcularAumento(10); // aumento de 10%

        System.out.println("Salário anual depois do aumento: R$" + funcionarios.calcularSalarioAnual());
    }
}