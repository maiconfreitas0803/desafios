package Desafio3;

public class Pedido {
    String nome;
    String produto;
    int quantidade;
    double preco;

    public Pedido(String nome, String produto, int quantidade, double preco){
        this.nome = nome;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    double calcularSubtotal(){
        return quantidade * preco;
    }
    double calcularDesconto(){
        double subtotal = calcularSubtotal();
        if(subtotal < 50)
            return 0;
        else if (subtotal >= 50 && subtotal < 100)
            return 0.05;
        else
            return 0.1;
    }
    double calcularTotal(){
        double subtotal = calcularSubtotal();
        double desconto = subtotal * calcularDesconto();
        return subtotal - desconto;
    }
}
