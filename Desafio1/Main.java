package Desafio1;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nDesafio 1:");
        Produto produtos = new Produto("Pão com ovo",3.99,45);

        System.out.println("\nProduto: " + produtos.nome);
        System.out.println("O total dos produtos é " + produtos.calcularTotal());
    }
}

