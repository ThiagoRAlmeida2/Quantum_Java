
import java.util.Scanner;

public class Ex_39 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Digite um número inteiro:");
                int numero = scanner.nextInt();
                if (numero % 2 == 0) {
                    System.out.println("O número é par.");
                } else {
                    System.out.println("O número é ímpar.");
                }
                if (numero > 0) {
                    System.out.println("O número é positivo.");
                } else if (numero < 0) {
                    System.out.println("O número é negativo.");
                } else {
                    System.out.println("O número é zero.");
                }
                System.out.println("Deseja encerrar o programa? (S/N)");
                String resposta = scanner.next();
                if (resposta.equalsIgnoreCase("S")) {
                    break;
                }
            }
            scanner.close();
        }
    }
