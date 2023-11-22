package lista3;

import java.util.Scanner;

public class questao32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número entre zero e dez: ");
        int num = input.nextInt();

        if (num > 0 && num < 10) {
            int soma = 0;
            int contador = 0;

            while (contador < 20) {
                if (num % 2 != 0) {
                    soma += num * num;
                    contador++;
                }
                num++;
            }

            System.out.println("A soma dos quadrados dos 20 primeiros números ímpares" + (num - 20) + " é: " + soma);
        } else {
            System.out.println("Número invalido.");
        }
        input.close();
    }
}
