package lista1;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 4 valores inteiros:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

                int Soma1 = a + b;
                int Soma2 = a + c;
                int Soma3 = a + d;
                int Soma4 = b + c;
                int Soma5 = b + d;
                int Soma6 = c + d;

                int Mult1 = a * b;
                int Mult2 = a * c;
                int Mult3 = a * d;
                int Mult4 = b * c;
                int Mult5 = b * d;
                int Mult6 = c * d;

                System.out.println("\nResultados das Operações de Adição:");
                System.out.println("A + B = " + Soma1);
                System.out.println("A + C = " + Soma2);
                System.out.println("A + D = " + Soma3);
                System.out.println("B + C = " + Soma4);
                System.out.println("B + D = " + Soma5);
                System.out.println("C + D = " + Soma6);

                System.out.println("\nResultados das Operações de Multiplicação:");
                System.out.println("A * B = " + Mult1);
                System.out.println("A * C = " +Mult2);
                System.out.println("A * D = " +Mult3);
                System.out.println("B * C = " + Mult4);
                System.out.println("B * D = " + Mult5);
                System.out.println("C * D = " + Mult6);

                scanner.close();
            }
        }
