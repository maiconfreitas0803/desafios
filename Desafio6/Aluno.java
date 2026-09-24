package Desafio6;

public class Aluno {
    String nome;
    int matricula;
    
    public Aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }
    double calcularMedia(double... notas){
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
