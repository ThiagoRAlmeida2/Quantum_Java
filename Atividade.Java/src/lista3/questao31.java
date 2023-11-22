package lista3;

import java.util.Scanner;

public class questao31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int somaPar = 0;
        int somaImpar = 0;

        System.out.println("Digite um conjunto de números positivos:");

        while (true) {
            System.out.print("Digite um número: ");
            num = input.nextInt();

            if (num < 0) {
                break;
            }
            if (num % 2 == 0) {
                System.out.println(num + " é par.");
                somaPar += num;
            } else {
                System.out.println(num + " é ímpar.");
                somaImpar += num;
            }
        }

        System.out.println("Soma dos números pares: " + somaPar);
        System.out.println("Soma dos números ímpares: " + somaImpar);

        input.close();
    }
}
