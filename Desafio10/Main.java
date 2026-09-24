package Desafio10;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nDesafio 10:");

        Aluno aluno1 = new Aluno("Maicon", 17, 70.0, 2.0);
        Aluno aluno2 = new Aluno("Erandir", 30, 95.0, 1.70);
        Aluno aluno3 = new Aluno("Océlio", 22, 50.0, 1.65);

        System.out.println(aluno1.nome + " \n- IMC: " + String.format("%.1f",+ aluno1.calcularIMC()) + " \n- Classificação: " + aluno1.classificarIMC());
        System.out.println(aluno2.nome + " \n- IMC: "  + String.format("%.1f",+ aluno2.calcularIMC()) + " \n- Classificação: " + aluno2.classificarIMC());
        System.out.println(aluno3.nome + " \n- IMC: "  + String.format("%.1f",+ aluno3.calcularIMC()) + " \n- Classificação: " + aluno3.classificarIMC());
    }
}