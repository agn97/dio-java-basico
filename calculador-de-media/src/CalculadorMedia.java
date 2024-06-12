import java.util.Scanner;

public class CalculadorMedia {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila : ","Pedro : ","Chico : ","Bento : "};

        double media = CalculaMediaDaTurma(alunos,scan);

        System.out.printf("Média da Turma : %.1f", media);
    }
    public static double CalculaMediaDaTurma (String[] alunos, Scanner scanner){
        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno : %s", aluno);
            double nota = scanner.nextDouble();
            soma += nota ;
        }

    return soma / alunos.length;
}
}
