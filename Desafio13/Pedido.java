package Desafio13;

public class Pedido {
    int numero;
    String cliente;
    Produto produto; // <- aqui é o objeto dentro de objeto
    int quantidade;

    public Pedido(int numero, String cliente, Produto produto, int quantidade) {
        this.numero = numero;
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    double calcularSubtotal() {
        return produto.preco * quantidade;
    }
    double calcularDesconto() {
        double subtotal = calcularSubtotal();
        if (subtotal < 100) {
            return 0;
        }
        else if (subtotal < 200) {
            return 0.05;
        }
        else {
            return 0.10;
        }
    }
    double calcularTotal() {
        double subtotal = calcularSubtotal();
        double porcentagem_desconto = calcularDesconto();
        double valor_desconto = subtotal * porcentagem_desconto;
        return subtotal - valor_desconto;
    }
}