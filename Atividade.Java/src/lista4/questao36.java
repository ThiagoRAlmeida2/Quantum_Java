package lista3;

import java.util.Scanner;

public class questao36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");

            int numero = input.nextInt();

            if (numero < 0) {
                System.out.println("Número inválido. Digite um número positivo.");
                i--;
                continue;
            }

            soma += numero;

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        double media = (double) soma / 10;

        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Média dos valores: " + media);

        input.close();
    }
}
