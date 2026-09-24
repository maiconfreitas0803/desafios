package Desafio15;
import java.util.ArrayList;

public class Estacionamento {
    ArrayList<Veiculo> veiculos = new ArrayList<>();

    void registrarEntrada(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("Veículo " + veiculo.placa + " registrado na entrada.");
    }

    void registrarSaida(String placa, int horaSaida) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.placa.equals(placa)) {
                double valor = calcularValor(veiculo, horaSaida);
                System.out.println("Veículo " + placa + " saiu. \nValor a pagar: R$" + String.format("%.2f", valor));
                veiculos.remove(veiculo);
                return;
            }
        }
        System.out.println("Veículo não encontrado.");
    }

    void consultarVeiculo(String placa) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo.placa.equals(placa)) {
                System.out.println("Placa: " + veiculo.placa);
                System.out.println("Modelo: " + veiculo.modelo);
                System.out.println("Hora de entrada: " + veiculo.horaEntrada + "h");
                return;
            }
        }
        System.out.println("Veículo não encontrado.");
    }

    double calcularValor(Veiculo veiculo, int horaSaida) {
        int horas = horaSaida - veiculo.horaEntrada;

        if (horas > 8) {
            return 50.0;
        } else if (horas <= 1) {
            return 10.0;
        } else {
            return 10.0 + (horas - 1) * 5.0;
        }
    }
}
