package Desafio9;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nDesafio 9:");

        Livro livro1 = new Livro("Declinio de um Homem", "Osamu Dazai", 666);

        livro1.mostrarDados();

        System.out.println();
        livro1.emprestar();   // deve funcionar
        livro1.emprestar();   // deve bloquear (já emprestado)

        System.out.println();
        livro1.devolver();    // deve funcionar
        livro1.devolver();    // deve bloquear (já disponível)

        System.out.println();
        livro1.mostrarDados();
    }
}