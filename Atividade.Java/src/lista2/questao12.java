package lista2;
import java.util.Scanner;

public class questao12 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        int numero,modulo;

        System.out.println("Digite o numero = ");
        numero = scanner.nextInt();

        if (numero >= 0) {
            modulo = numero;
        } else{
            modulo = numero * (-1);
        }

        System.out.println("esse é o numero" + numero);

        scanner.close();
    }
}

