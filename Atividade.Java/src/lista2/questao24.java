package lista2;
import java.util.Scanner;
public class questao24 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int numero1, numero2;

            System.out.print("Digite o primeiro número inteiro: ");
            numero1 = input.nextInt();

            System.out.print("Digite o segundo número inteiro: ");
            numero2 = input.nextInt();

            int escolha;
            do {
                System.out.println("\nEscolha uma opção:");
                System.out.println("1 - Verificar se um dos números é múltiplo do outro");
                System.out.println("2 - Verificar se ambos os números são pares");
                System.out.println("3 - Verificar se a média dos números é maior ou igual a 7");
                System.out.println("4 - Sair");

                escolha = input.nextInt();

                switch (escolha) {
                    case 1 -> {
                        if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
                            System.out.println("Um dos números é múltiplo do outro.");
                        } else {
                            System.out.println("Nenhum dos números é múltiplo do outro.");
                        }
                    }
                    case 2 -> {
                        if (numero1 % 2 == 0 && numero2 % 2 == 0) {
                            System.out.println("Ambos os números são pares.");
                        } else {
                            System.out.println("Pelo menos um dos números não é par.");
                        }
                    }
                    case 3 -> {
                        double media = (numero1 + numero2) / 2.0;
                        if (media >= 7) {
                            System.out.println("A média dos números é maior ou igual a 7.");
                        } else {
                            System.out.println("A média dos números é menor que 7.");
                        }
                    }
                    case 4 -> System.out.println("Saindo do programa.");
                    default -> System.out.println("Opção inválida. Escolha novamente.");
                }
            } while (escolha != 4);

            input.close();
        }
    }

