package Desafio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nDesafio 4:");

        Scanner banco = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria("Maicon", 12345, 0.0);

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1-Depositar");
            System.out.println("2-Sacar");
            System.out.println("3-Consultar saldo");
            System.out.println("4-Sair");
            System.out.print("Escolha uma opção: ");
            opcao = banco.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = banco.nextDouble();
                    conta.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = banco.nextDouble();
                    conta.sacar(valorSaque);
                    break;

                case 3:
                    System.out.println("Saldo atual: R$" + conta.consultarSaldo());
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);
    }
}
