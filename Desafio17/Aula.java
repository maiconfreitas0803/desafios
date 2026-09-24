package Desafio17;

import java.util.ArrayList;
import java.util.List;

public class Aula {
    int duracao;
    String tecnica;
    Mestre mestre;
    List<Aluno> alunos;
    String categoria;

    public Aula(int duracao, String tecnica, Mestre mestre, String categoria) {
        this.duracao = duracao;
        this.tecnica = tecnica;
        this.mestre = mestre;
        this.alunos = new ArrayList<>();
        this.categoria = categoria;
    }

    void adicionarAluno(Aluno aluno) {
        if (categoria.equals("Infantil") && aluno.idade > 15) {
            System.out.println(aluno.nome + " tem idade acima do permitido para a aula Infantil.");
            return;
        }
        else if (categoria.equals("Adulto") && aluno.idade <= 15) {
            System.out.println(aluno.nome + " ainda não tem idade mínima para a aula Adulta.");
            return;
        }
        alunos.add(aluno); // metodo do arraylist que coloca o aluno dentro da lista alunos
        System.out.println(aluno.nome + " foi adicionado à aula.");
    }

    int contarAlunos() {
        return alunos.size(); // metodo pronto que devolve qnts itens tem na lista
    }

    void listarAlunos() {
        System.out.println("Alunos na aula de " + tecnica + ":");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.nome + " (Faixa " + aluno.faixa + ")");
        }
    }
}