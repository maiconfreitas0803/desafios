package Desafio5;

public class Veiculo{
    String placa;
    String modelo;
    int horas;

    public Veiculo(String placa, String modelo, int horas){
       this.placa = placa;
       this.modelo = modelo;
       this.horas = horas;
    }
     double calcularValor(){
       if (horas > 8) {
            return 50.0;
        } else if (horas <= 1) {
            return 10.0;
        } else {
            return 10.0 + (horas - 1) * 5.0;
        }
    }
}
