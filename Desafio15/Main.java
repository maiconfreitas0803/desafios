package Desafio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nDesafio 15:");

        Scanner scanner = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1-Registrar entrada");
            System.out.println("2-Registrar saída");
            System.out.println("3-Consultar veículo");
            System.out.println("4-Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // limpa o "Enter" pendente
                    System.out.print("Placa: ");
                    String placaEntrada = scanner.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Hora de entrada (0-23): ");
                    int horaEntrada = scanner.nextInt();

                    Veiculo veiculo = new Veiculo(placaEntrada, modelo, horaEntrada);
                    estacionamento.registrarEntrada(veiculo);
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.print("Placa do veículo que vai saír: ");
                    String placaSaida = scanner.nextLine();
                    System.out.print("Hora de saída (0-23): ");
                    int horaSaida = scanner.nextInt();

                    estacionamento.registrarSaida(placaSaida, horaSaida);
                    break;

                case 3:
                    scanner.nextLine();
                    System.out.print("Placa do veículo a consultar: ");
                    String placaConsulta = scanner.nextLine();

                    estacionamento.consultarVeiculo(placaConsulta);
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }
}