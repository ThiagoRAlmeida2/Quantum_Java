package lista2;

import java.util.Scanner;

public class questao19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do triangulo A:");
        double A = scanner.nextDouble();

        System.out.println("Digite o lado do triangulo B:");
        double B = scanner.nextDouble();

        System.out.println("Digite o lado do triangulo C:");
        double C = scanner.nextDouble();

        if (A < B + C && B < A + C && C < A + B) {
            if (A == B && B == C) {
                System.out.println("O triângulo é equilátero.");
            } else if (A == B || A == C || B == C) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os lados fornecidos não caracterizam um triângulo.");
        }

        scanner.close();
    }
}