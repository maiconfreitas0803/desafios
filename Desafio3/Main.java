package Desafio3;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nDesafio 3:");
        Pedido pedidos = new Pedido("maicon", "café", 5, 10);
        System.out.println("Total do pedido: " + pedidos.calcularTotal());
        System.out.println("Dados do pedido\nNome do produto: "+ pedidos.produto + "\nQuantidade: " + pedidos.quantidade + "\nPreço: " + pedidos.preco);
    }

}
