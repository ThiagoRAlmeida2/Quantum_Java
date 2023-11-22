package lista2;
import java.util.Scanner;

public class questao14 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, diferenca;

        System.out.println("Digite o primeiro número = ");
        numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número = ");
        numero2 = scanner.nextInt();

        diferenca = Math.abs(numero1 - numero2);

        System.out.println("Esta é a diferença entre os números = " + diferenca);

        scanner.close();
    }
}
