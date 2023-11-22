package lista2;
import java.util.Scanner;
public class questao25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a altura (em metros):");
        double altura = input.nextDouble();

        System.out.print("Digite o sexo (M para masculino, F para feminino):");
        char sexo = input.next().charAt(0);

        double pesoIdeal;

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("O peso ideal para um homem com altura de " + altura + "metros é:" + pesoIdeal + "kg");
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("O peso ideal para uma mulher com altura de " + altura + "metros é:" + pesoIdeal + "kg");
        } else {
            System.out.println("Sexo inválido. Por favor, insira 'M' ou 'F'.");
        }

        input.close();
    }
}

