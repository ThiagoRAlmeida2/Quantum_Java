package lista3;

import java.util.Scanner;

public class questao34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um conjunto de números positivos (digite um número negativo para sair):");

        int num;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (true) {
            System.out.print("Digite um número: ");
            num = input.nextInt();

            if (num < 0) {
                break;
            }
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum número foi inserido.");
        } else {
            System.out.println("O maior número é: " + maior);
            System.out.println("O menor número é: " + menor);
        }

        input.close();
    }
}
