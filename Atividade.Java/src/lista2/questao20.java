package lista2;
import java.util.Scanner;
public class questao20 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int a, b, c;

            do {
                System.out.println("Digite o valor de A (maior que zero):");
                a = scanner.nextInt();
            } while (a <= 0);

            do {
                System.out.println("Digite o valor de B (maior que zero):");
                b = scanner.nextInt();
            } while (b <= 0);

            do {
                System.out.println("Digite o valor de C (maior que zero):");
                c = scanner.nextInt();
            } while (c <= 0);

            int menor = Math.min(Math.min(a, b), c);
            int maior = Math.max(Math.max(a, b), c);

            int mult = menor * maior;
            double div = (double) maior / menor;

            System.out.println("O menor valor multiplicado pelo maior é: " + mult);
            System.out.println("O maior valor dividido pelo menor é: " + div);

            scanner.close();
    }
}
