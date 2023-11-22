import java.util.Scanner;

public class Ex_44 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char encerrar = 'N';

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 – Conversão de Graus Celsius em Graus Fahrenheit");
            System.out.println("2 – Conversão de Graus Fahrenheit em Graus Celsius");
            System.out.println("3 – Peso ideal do homem");
            System.out.println("4 – Peso ideal da mulher");
            System.out.println("S – Encerrar o programa");
            System.out.print("Opção: ");
            char opcao = scanner.next().charAt(0);

            switch (opcao) {
                case '1':
                    System.out.print("Digite a temperatura em Graus Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
                    break;
                case '2':
                    System.out.print("Digite a temperatura em Graus Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    celsius = fahrenheitToCelsius(fahrenheit);
                    System.out.println("A temperatura em Celsius é: " + celsius);
                    break;
                case '3':
                    System.out.print("Digite a altura em metros: ");
                    double altura = scanner.nextDouble();
                    double pesoIdealHomem = calcularPesoIdealHomem(altura);
                    System.out.print("Digite o peso atual em kg: ");
                    double pesoAtualHomem = scanner.nextDouble();
                    if (pesoAtualHomem > pesoIdealHomem) {
                        System.out.println("Você está acima do peso ideal.");
                    } else if (pesoAtualHomem < pesoIdealHomem) {
                        System.out.println("Você está abaixo do peso ideal.");
                    } else {
                        System.out.println("Você está no peso ideal.");
                    }
                    break;
                case '4':
                    System.out.print("Digite a altura em metros: ");
                    altura = scanner.nextDouble();
                    double pesoIdealMulher = calcularPesoIdealMulher(altura);
                    System.out.print("Digite o peso atual em kg: ");
                    double pesoAtualMulher = scanner.nextDouble();
                    if (pesoAtualMulher > pesoIdealMulher) {
                        System.out.println("Você está acima do peso ideal.");
                    } else if (pesoAtualMulher < pesoIdealMulher) {
                        System.out.println("Você está abaixo do peso ideal.");
                    } else {
                        System.out.println("Você está no peso ideal.");
                    }
                    break;
                case 'S':
                case 's':
                    encerrar = 'S';
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

        } while (encerrar != 'S');

        System.out.println("Programa encerrado.");
        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double calcularPesoIdealHomem(double altura) {
        return (72.7 * altura) - 58;
    }

    public static double calcularPesoIdealMulher(double altura) {
        return (62.1 * altura) - 44.7;
    }
}
