package Desafio14;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nDesafio 15");

        Curso curso = new Curso("DDS", 120);
        Aluno alunos = new Aluno("Maicon", 1222, curso);
        alunos.mostrarDados();
    }
}
