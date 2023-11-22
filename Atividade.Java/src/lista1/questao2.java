package lista1;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cotação em dolar:");
        float CotDolar = scanner.nextFloat();

        System.out.println("Digite valor desejado:");
        float Dolar = scanner.nextFloat();

        float ValorReal = CotDolar * Dolar;

        System.out.println("Valor da conversão:" + ValorReal);

        scanner.close();

    }
}

