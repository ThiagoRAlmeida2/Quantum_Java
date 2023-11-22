package lista2;
import java.util.Scanner;

public class questao17 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite o numero = ");
        numero = scanner.nextInt();

        if (numero >=0 && numero <=9) {
            System.out.println("valido");
        }else {
            System.out.println("invalido");
        }

        scanner.close();
    }
}


