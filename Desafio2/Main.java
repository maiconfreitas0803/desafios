package Desafio2;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nDesafio 2:");
        Alunos aluno = new Alunos("Maicon", 566280, 9, 10,5);
        System.out.println("======================");
        System.out.println("Dados do aluno: "+ aluno.mostrarDados());
         System.out.println("======================");
        System.out.println("\nSua media é "+ aluno.calcularMedia());
        System.out.println("Você está "+ aluno.verificarAprovacao());
    }
}
