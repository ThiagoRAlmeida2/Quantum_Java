package lista2;

import java.util.Scanner;

public class questao22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
       int numero = scanner.nextInt();

       int A = 0;
       int B = 0;

        if(numero > 0 ){
            A = numero;
        } else if (numero < 0){
            B = numero;
        }

        System.out.println("O valor de A é:" + A);
        System.out.println("O valor de B é:" + B);

        scanner.close();
    }
}