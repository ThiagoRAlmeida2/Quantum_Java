package lista1;

import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade de peça minima:");
        double Qts_MIn = scanner.nextDouble();

        System.out.println("Quantidade de peça maxima:");
        double Qts_Max = scanner.nextDouble();

        double media = (Qts_MIn + Qts_Max) / 2;

        System.out.print("Estoque medio:" + media);

        scanner.close();

    }
}