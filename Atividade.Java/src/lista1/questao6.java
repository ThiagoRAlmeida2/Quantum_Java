package lista1;

import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatuda em graus Celsius:");
        double Celsius = scanner.nextDouble();

        double Fahrenheit = (9 * Celsius + 160) / 5;

        System.out.println("Aqui é a temperatura em Fahrenheit:" + Fahrenheit);

        scanner.close();
    }
}
