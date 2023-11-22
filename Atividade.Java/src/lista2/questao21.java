package lista2;
import java.util.Scanner;

public class questao21 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int A = 0;
        int B = 0;

        System.out.println("Digite um numero = ");
        numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("foi armazenado em : A ");
             A = scanner.nextInt();
        }else if ( numero > 0) {
            System.out.println("foi armazenado em : B");
             B = scanner.nextInt();
        }

        System.out.println("Valor de A:" + A);
        System.out.println("Valor de B:" + B);

        scanner.close();
    }
}

