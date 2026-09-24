package Desafio11;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nDesafio 11:");

        Corrida corrida1 = new Corrida("Maicon", 10);
        Corrida corrida2 = new Corrida("Madson", 25);

        System.out.println(corrida1.passageiro + " \n- Distância: " + corrida1.distancia + "km \n- Valor: R$" + String.format("%.2f", corrida1.calcularValor()));
        System.out.println(corrida2.passageiro + " \n- Distância: " + corrida2.distancia + "km \n- Valor: R$" + String.format("%.2f", corrida2.calcularValor()));
    }
}