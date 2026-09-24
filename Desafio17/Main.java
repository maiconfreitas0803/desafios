package Desafio17;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nDesafio 17:");
        System.out.println("\n--------------- Sistema Academia de Jiu Jitsu ---------------");
        
        // mestre
        Mestre mestre = new Mestre("João", "Preta");
        System.out.println("\nMestre: " + mestre.nome + " - Título: " + mestre.verificarCargo());
        
        // aula para adultos
        Aula aulaAdulto = new Aula(60, "Guarda", mestre, "Adulto");

        Aluno aluno1 = new Aluno("Maicon", "Branca", 22, 67);
        Aluno aluno2 = new Aluno("Gabriel", "Branca", 14, 68); // menor de idade
        Aluno aluno3 = new Aluno("Wellington", "Roxa", 30, 69);
        Aluno aluno4 = new Aluno("Pedro", "Rosa", 19, 70); // faixa inválida

        System.out.println("\n--- Testando categoria/faixa dos alunos ---");
        System.out.println(aluno1.nome + " - Categoria: " + aluno1.verificarIdade() + " - Faixa: " + aluno1.graduacao());
        System.out.println(aluno4.nome + " - Faixa: " + aluno4.graduacao());

        System.out.println("\n--- Adicionando alunos na aula Adulto ---");
        aulaAdulto.adicionarAluno(aluno1); // entra
        aulaAdulto.adicionarAluno(aluno2); // n entra
        aulaAdulto.adicionarAluno(aluno3); // entr


        System.out.println("\nTotal de alunos na aula: " + aulaAdulto.contarAlunos());

        System.out.println();
        aulaAdulto.listarAlunos();


        // segunda aula - infantil
        System.out.println("\n\n--- Aula Infantil/Juvenil ---");
        Aula aulaInfantil = new Aula(45, "Raspagem", mestre, "Infantil");
        aulaInfantil.adicionarAluno(aluno2);
        aulaInfantil.adicionarAluno(aluno1); // n entra

        System.out.println("\nTotal de alunos na aula Infantil: " + aulaInfantil.contarAlunos());
        System.out.println();
        aulaInfantil.listarAlunos();

        System.out.println("\n-------------------------------------------------------------");
        
    }
}
