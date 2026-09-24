package Desafio7;

public class Produto {
    int codigo;
    String nome;
    double preco;
    int estoque;

    public Produto(int codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }
    void adicionarEstoque(int quantidade){
         if (quantidade < 0) {
            System.out.println("Quantidade invalida!");
            return;
        }
        estoque += quantidade;
        System.out.println(quantidade + " unidades adicionadas ao estoque.");
    }
    void vender(int quantidade){
        if (quantidade < 0){
            System.out.println("Quantidade invalida!");
            return;
        }
        else if (quantidade > estoque){
            System.out.println("Estoque insuficiente!");
        }
        else {
            estoque -= quantidade;
            System.out.println("Venda de " + quantidade + " unidades realizada.");
        }
    }
    int consultarEstoque() {
        return estoque;
    }
     double calcularValorEstoque() {
        return preco * estoque;
    }

}