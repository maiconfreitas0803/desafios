package Desafio17;

public class Aluno {
    String nome;
    String faixa;
    int idade;
    int matricula;

    public Aluno(String nome, String faixa, int idade, int matricula){
        this.nome = nome;
        this.faixa = faixa;
        this.idade = idade;
        this.matricula = matricula;
    }
    
    String verificarIdade() {
        if (idade <= 15){
            return "Infantil/Juvenil";
        }
        else {
            return "Adulto";
        }
    }

    String graduacao() {
        switch (faixa) {
            case "Branca":
                return faixa;
            case "Azul":
                return faixa;
            case "Roxa":
                return faixa;
            case "Marrom":
                return faixa;
            case "Preta":
                return faixa;
            case "Coral":
                return faixa;
            default:
                return "Faixa invalida.";
        }
    }

}
