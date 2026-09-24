package Desafio7;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nDesafio 7:");

        Produto produtos = new Produto(1, "Fone de ouvido", 50.0, 20);

        System.out.println("Estoque inicial: " + produtos.consultarEstoque());

        produtos.adicionarEstoque(10);   // adiciona 10, estoque vira 30
        produtos.vender(5);              // vende 5, estoque vira 25
        produtos.vender(1000);           // da erro, estoque insuficiente
        produtos.adicionarEstoque(-3);   // da erro, quantidade negativa

        System.out.println("Estoque atual: " + produtos.consultarEstoque());
        System.out.println("Valor total em estoque: R$" + produtos.calcularValorEstoque());
    }
}