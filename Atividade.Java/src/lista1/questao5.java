package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Digite o tempo de viagem: (Em horas)");
        double tempo = scanner.nextDouble();

        System.out.println("Qual foi a sua velocidade media? (Em km/h)");
        double VelocidadeM = scanner.nextDouble();

      double distancia = tempo * VelocidadeM;
      double Combustivel = distancia /12.0;

        System.out.println("Velocidade Média: " + VelocidadeM + " km/h");
        System.out.println("Tempo Gasto: " + tempo + " horas");
        System.out.println("Distância Percorrida: " + distancia + " km");
        System.out.println("Quantidade de Litros de Combustível Utilizada:" + df.format(Combustivel) + " litros");

        scanner.close();

    }
}
