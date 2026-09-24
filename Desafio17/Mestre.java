package Desafio17;

public class Mestre {
    String nome;
    String faixa;

    public Mestre(String nome, String faixa) {
        this.nome = nome;
        this.faixa = faixa;
    }

    boolean podeEnsinar(){
        switch (faixa) {
            case "Coral":
            case "Preta":
                return true;
            default:
                return false;
        }
    }
    String verificarCargo(){
        switch (faixa) {
            case "Coral":
            case "Preta":
                return "Mestre";
            case "Marrom":
                return "instrutor";
            default:
                return "Aluno";
        }
    }
}
