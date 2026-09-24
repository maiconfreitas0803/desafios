package Desafio13;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nDesafio 13:");

        Produto produto1 = new Produto("Notebook", 3750.0);
        Pedido pedido1 = new Pedido(1, "Maicon", produto1, 1);

        System.out.println("\nCliente: " + pedido1.cliente);
        System.out.println("Produto: " + pedido1.produto.nome);
        System.out.println("Quantidade: " + pedido1.quantidade);
        System.out.println("\n--- Custo a pagar ---");
        System.out.println("Subtotal: R$" + String.format("%.2f", pedido1.calcularSubtotal()));
        System.out.println("Desconto: " + (pedido1.calcularDesconto() * 100) + "%");
        System.out.println("Total: R$" + String.format("%.2f", pedido1.calcularTotal()));
    }
}