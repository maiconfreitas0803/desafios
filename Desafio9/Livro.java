package Desafio9;

public class Livro {
    String titulo;
    String autor;
    int codigo;
    boolean disponivel;

    public Livro(String titulo, String autor, int codigo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.disponivel = true; // todo livro novo começa disponível
    }

    void emprestar() {
        if (!disponivel) {
            System.out.println("O livro \"" + titulo + "\" já está emprestado.");
            return;
        }
        disponivel = false;
        System.out.println("Livro \"" + titulo + "\" emprestado com sucesso!");
    }

    void devolver() {
        if (disponivel) {
            System.out.println("O livro \"" + titulo + "\" não está emprestado.");
            return;
        }
        disponivel = true;
        System.out.println("Livro \"" + titulo + "\" devolvido com sucesso!");
    }

    void mostrarDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Código: " + codigo);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }
}