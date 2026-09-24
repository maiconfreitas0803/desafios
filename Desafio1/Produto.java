package Desafio1;
public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    double calcularTotal() {
        double total = preco * quantidade;
        double desconto = total * 0.10;
        if(total >= 100) {
            return total - desconto;
        } else {
            return total;
        }
    }
}
