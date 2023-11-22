package lista1;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a temperatura em Fahrenheit?");
        double f = scanner.nextDouble();

        double C = (f - 32) * 5 / 9;

        System.out.println("Aqui é a temperatura em Celsius:" + C);

        scanner.close();
    }
}
