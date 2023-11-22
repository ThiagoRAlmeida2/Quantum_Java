import java.util.Scanner;

public class Ex_38 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resposta;


        do {

            System.out.println("digite qual o id do trabalhador: ");
            int id = scanner.nextInt();

            System.out.println("Digite as horas trabalhadas: ");
            int horas_trabalhadas = scanner.nextInt();


            double salario = 0;
            double salario_extra = 0;

            if (horas_trabalhadas <= 50) {
                salario = horas_trabalhadas * 10;
            } else {
                salario = 50 * 10;
                salario_extra = (horas_trabalhadas - 50) * 20;
            }

            System.out.println("Esse e o salario: " + salario);
            System.out.println("Esse e o salario extra: " + salario_extra);


            System.out.println("Deseja continuar? S/n: ");
            resposta = scanner.next();


        }while (!resposta.equalsIgnoreCase("S"));

    }
}