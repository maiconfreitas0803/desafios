package Desafio12;

public class Conta {
    String titular;
    double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito invalido!");
            return;
        }
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado!");
    }

    void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque invalido!");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return;
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado!");
    }

    double consultarSaldo() {
        return saldo;
    }
}