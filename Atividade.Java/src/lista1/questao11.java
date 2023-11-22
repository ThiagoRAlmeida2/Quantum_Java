package lista2;

import java.util.Scanner;

public class questao11 {
        public static void main (String [] args) {
            Scanner scanner = new Scanner(System.in);
            int a,b;
            System.out.println("Digite o valor de A:");
            a = scanner.nextInt();

            System.out.println("Digite o valor de B:");
            b = scanner.nextInt();

            int temp = a;
            a = b;
            b = temp;

            System.out.println("Depois da troca:");
            System.out.println("A: " + a);
            System.out.println("B: " + b);

            scanner.close();
        }
}