package lista2;

import java.util.Scanner;

public class questao15 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, nota3, nota4, media, notaposrec, nova_media;

        System.out.println("Digite a 1 nota do aluno");
        nota1 = scanner.nextDouble();

        System.out.println("Digite a 2 nota do aluno");
        nota2 = scanner.nextDouble();

        System.out.println("Digite a 3 nota do aluno");
        nota3 = scanner.nextDouble();

        System.out.println("Digite a 4 nota do aluno");
        nota4 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Aprovado com média: " + media);
        } else {
            System.out.println("Nota de recuperação: ");
            notaposrec = scanner.nextDouble();
            nova_media = (media + notaposrec) / 2;

            if (nova_media >= 7) {
                System.out.println("Aprovado após recuperação com média: " + nova_media);
            } else {
                System.out.println("Reprovado com média final: " + nova_media);
            }
        }

    }
}
