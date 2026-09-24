package Desafio2;
public class Alunos {
    String nome;
    int matricula;
    double nota1;
    double nota2;
    double nota3;

    public Alunos(String nome, int matricula, double nota1, double nota2, double nota3){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    double calcularMedia() {
        double media = nota1 + nota2 + nota3;
        return media / 3;
    }
    
    String verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 6){
            return "aprovado";
        }
        else if (media < 6 && media >= 4){
            return "de recuperação";
        }
        else {
            return "reprovado";
        }
    }
    String mostrarDados() {
        return "\nNome: " + nome
        + "\nMatricula: " + matricula
        + "\nSuas notas:"
        + "\n"+ nota1
        + "\n"+ nota2
        + "\n"+ nota3;
    }

}
