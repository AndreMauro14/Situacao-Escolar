import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Atividade {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String opcao;
        do {
            String nome;
            do {
                System.out.print("Digite o nome do aluno: ");
                nome = sc.nextLine();
                if (!nome.matches("^[a-zA-Záéíóú ]+$")) {
                    System.out.println("ERRO! SO PODE CONTER LETRAS NO NOME.");
                }
            } while (!nome.matches("^[a-zA-Záéíóú ]+$"));

            double nota1;
            do {
                System.out.print("Digite sua primeira nota: ");
                nota1 = sc.nextDouble();
                sc.nextLine();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("ERRO! SEU NUMERO TEM QUE SER ENTRE 0 E 10.");
                }
            }while (nota1 < 0 || nota1 > 10);

            double nota2;
            do {
                System.out.print("Digite sua segunda nota: ");
                nota2 = sc.nextDouble();
                sc.nextLine();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("ERRO! SEU NUMERO TEM QUE SER ENTRE 0 E 10.");
                }
            }while (nota2 < 0 || nota2 > 10);

            double maiornota = Math.max (nota1, nota2);

            double media =(nota1 + nota2)/2;



            String  situacao;

            if (media >=7){
                situacao="APROVADO POR MEDIA";
            }else if (media >=5 && media <=6.9){
                situacao="APROVADO";
            }else {
                situacao="REPROVADO";
            }
            Aluno aluno = new Aluno(nome,nota1,nota2,maiornota,media,situacao);
            alunos.add(aluno);

            System.out.println("você deseja continuar? [sim/nao]");
            opcao = sc.nextLine();

        }while (opcao.equalsIgnoreCase("sim"));
        System.out.println("O TOTAL DE ALUNOS CADASTRADOS FORAM: "+alunos.size()+" ENCERRANDO...");

        System.out.println("------UNICAP------");
        for (Aluno a : alunos){
            System.out.println("ALUNO: " + a.nome);
            System.out.println("SUA NOTA 1 FOI: "+a.nota1 + " SUA NOTA 2 FOI: "+a.nota2);
            System.out.println("SUA MAIOR NOTA FOI: " + a.maiornota);
            System.out.println("SUA MEDIA FOI: " + a.media);
            System.out.println("SUA SITUACAO FOI: " + a.situacao);
            System.out.println("----------------------------------------------------");
        }

    }
}
