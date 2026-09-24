package Desafio14;

public class Aluno {
    String nome;
    int matricula;
    Curso curso;

    public Aluno(String nome, int matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    void mostrarDados(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Matricula do aluno: "+ matricula);
        System.out.println("\nDados do curso:");
        System.out.println("Curso do aluno: "+ curso.nome);
        System.out.println("Carga horaria do curso: "+ curso.cargaHoraria);
    }
}