package lista2;
import java.util.Scanner;
public class questao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro numero:");
        int num3 = scanner.nextInt();


        int maior = num1;

        if(num2 > maior){
            maior = num2;
        }
        if(num3 > maior){
            maior = num3;
        }


        int meio;

        if (num1 != maior && num1 != Math.min(num2, num3)) {
            meio = num1;
        } else if (num2 != maior && num2 != Math.min(num1, num3)) {
            meio = num2;
        } else {
            meio = num3;
        }

        int menor = num1 + num2 + num3 - maior - meio;

        System.out.println("Os numeros na ordem decrecente:");
        System.out.println("O primeiro numero é:" + maior);
        System.out.println("O segundo numero é:" + meio);
        System.out.println("O terceiro numero é:" +menor);

        scanner.close();
    }
}
