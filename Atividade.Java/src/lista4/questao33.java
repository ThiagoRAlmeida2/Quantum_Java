package lista3;

import java.util.Scanner;
public class questao33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalAluno = 0;
        double somaNota = 0;

        System.out.println("Digite as notas dos alunos:");

        while (true) {
            System.out.print("Número de matrícula: ");
            int matricula = input.nextInt();

            if (matricula < 0) {
                break;
            }

            System.out.print("Nota do aluno: ");
            double nota = input.nextDouble();

            somaNota += nota;
            totalAluno++;
        }
        input.close();

        if (totalAluno > 0) {
            double media = somaNota / totalAluno;
            System.out.println("Média das notas dos " + totalAluno + " alunos: " + media);
        } else {
            System.out.println("Não tem registro");
        }
    }
}
