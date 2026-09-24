package Desafio5;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nDesafio 5:");

        Veiculo veiculo = new Veiculo("OSS-0212", "Peogeut", 3);

        System.out.println("Placa: " + veiculo.placa);
        System.out.println("Modelo: " + veiculo.modelo);
        System.out.println("Horas estacionado: " + veiculo.horas);
        System.out.println("Valor a pagar: R$" + veiculo.calcularValor());
    }
}