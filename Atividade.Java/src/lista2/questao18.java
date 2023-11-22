package lista2;
import java.util.Scanner;
public class questao18 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo;

        System.out.println("Digite o codigo (1 2 3) = ");

        codigo = scanner.nextInt();

        String resultado = switch (codigo) {
            case 1 -> "Um";
            case 2 -> "Dois";
            case 3 -> "Três";
            default -> "Código inválido";
        };

        System.out.println(resultado);

        scanner.close();
    }

}
