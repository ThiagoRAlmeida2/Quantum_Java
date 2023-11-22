package lista3;

import java.util.Scanner;

public class questao27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros para ser processados:");
        int quant = input.nextInt();

        for (int i = 1; i <= quant; i++) {
            System.out.println("Digite um numero" + i + ":");
            int num = input.nextInt();

            long fatorial = calFat(num);
            System.out.println("O fatorial de" + num + "é:" + fatorial);
        }
        input.close();
    }
    public static long calFat(int num) {
        if (num < 0) {
            return -1; //indicativo de entrada invalida (numero negativo)
        }
        long fatorial = 1;
        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
