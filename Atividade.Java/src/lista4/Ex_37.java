import java.util.Scanner;

public class Ex_37 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

             int opcao, num1, num2;



                   System.out.println(" O que deseja fazer = 1 – Adição \n" +
                           "2 – Subtração \n" +
                           "3 – Multiplicação 4 – Divisão ");
                           opcao = scanner.nextInt();

                switch (opcao) {

                case 1:

                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("O resultado é: " + (num1 + num2));
                    break;

                case 2:

                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("O resultado é: " + (num1 - num2));
                    break;

                case 3:

                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("O resultado é: " + (num1 * num2));
                    break;

                case 4:

                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextInt();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("O resultado é: " + (num1 / num2));
                    break;

                default:

                    System.out.println("Error");
             }







        }





}