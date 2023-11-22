package lista1;

import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da lata: ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura da lata: ");
        double altura = scanner.nextDouble();

        double volume = 3.14159 * raio * raio * altura;

        System.out.println("O volume da lata é: " + volume);
        scanner.close();
    }
}