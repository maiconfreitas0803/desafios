package Desafio4;

public class ContaBancaria {
    String titular;
    int numero;
    double saldo;

    public ContaBancaria (String titular, int numero, double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
    void depositar(double valor) {
        if (valor < 0 ){
            System.out.println("Valor invalido!");
            return;
        }
        saldo += valor;
        System.out.println("Deposito de "+ valor + " reais realizado.");
    }

    void sacar(double valor) {
        if (valor <= 0){
            System.out.println("Saque invalido!");
            return;
        }
        else if (valor > saldo){
            System.out.println("Saldo insuficiente.");
        }
        else
        saldo -= valor;
        System.out.println("Saque de "+ valor + " reais realizado!");
    }

    double consultarSaldo() {
        return saldo;
    }

}
