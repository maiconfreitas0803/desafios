package Desafio6;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nDesafio 6:");

        Aluno aluno1 = new Aluno("Maicon", 1);
        Aluno aluno2 = new Aluno("Wellington", 2);
        Aluno aluno3 = new Aluno("Gabriel", 3);
        Aluno aluno4 = new Aluno("Janiene", 4);
        Aluno aluno5 = new Aluno("Bianca", 5);

        System.out.println(aluno1.nome + " - Média: " + aluno1.calcularMedia(7.5, 8.0, 6.5));
        System.out.println(aluno2.nome + " - Média: " + aluno2.calcularMedia(9.0, 8.5));
        System.out.println(aluno3.nome + " - Média: " + aluno3.calcularMedia(6.0, 7.0, 5.5, 8.0));
        System.out.println(aluno4.nome + " - Média: " + aluno4.calcularMedia(10.0, 9.5, 9.0));
        System.out.println(aluno5.nome + " - Média: " + aluno5.calcularMedia(4.0, 5.0));
    }
}