package lista2;

import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("O maior numero é:" + num1);
            System.out.println("O menor numero é:" + num2);
        } else if (num2 > num1){
            System.out.println("O maior numero é:" + num2);
            System.out.println("O menor numero é:" + num1);
        } else {
            System.out.println("Os dois numeros são iguais" + num1);
        }

        scanner.close();
    }
}