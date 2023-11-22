import  java.util.Scanner;

public class Ex_42 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        int maior = numero;
        int menor = numero;

        while (true){

            System.out.println("Digite um numero: ");
            numero = scanner.nextInt();

            if (numero == 0){
                break;
            }if (numero > maior) {

                maior = numero;

            } else if (numero < menor ) {

                menor = numero;
            }


        }

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);


        }
    }

