package lista3;
import java.util.Scanner;

public class questao30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = input.nextInt();

        System.out.println("Tabuada de " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        input.close();
    }
}
