import java.util.Scanner;

public class Ex_41 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Informe sua idade: ");
        numero = scanner.nextInt();

        switch (numero) {

            case 1:

                if (numero >= 5 && numero <= 7){

                    System.out.println("voce e infantil A" + numero);

                    break;
                }

            case 2:

                if (numero >= 8 && numero <= 11){

                    System.out.println("voce e infantil B" + numero);

                    break;
                }

            case 3:

                if (numero >= 12 && numero <= 13){

                    System.out.println("você é juvenil A" + numero);

                    break;
            }

            case 4:

                if (numero >= 14 && numero <= 17){

                    System.out.println("voce e juvenil B" + numero);

                    break;
                }

            case 5:

                if (numero >= 18){

                    System.out.println("adulto" + numero);

                    break;

                }
        }
        scanner.close();



    }
}
