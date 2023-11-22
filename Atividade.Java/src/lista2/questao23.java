package lista2;
import java.util.Scanner;

public class questao23 {
    public static void main (String []args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, operacao, multi, div, soma, sub;

        System.out.println("Digite um numero = ");
        num1 = scanner.nextInt();

        System.out.println("Digite um numero = ");
        num2 = scanner.nextInt();

        System.out.println("Digite uma operação = \n \nMultiplicação - 1 \n Divisão - 2 \n Soma - 3\n Subtração - 4 \n");
        operacao= scanner.nextInt();

        if (operacao == 1) {
            multi = num1 * num2;
            System.out.println("O resultado foi = " + multi);
        }if (operacao == 2) {
            div = num1 / num2;
            System.out.println("O resultado foi = " + div);
        }if (operacao == 3) {
            soma = num1 + num2;
            System.out.println("O resultado foi = " + soma);
        }if (operacao == 4) {
            sub = num1 - num2;
            System.out.println("O resultado foi = " + sub);
        }
        scanner.close();
    }

}
