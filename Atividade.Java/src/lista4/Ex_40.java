import java.util.Scanner;

public class Ex_40 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String resposta;

            do {
                System.out.print("Digite o índice de poluição: ");
                double indice = scanner.nextDouble();

                if (indice >= 0.5) {
                    System.out.println("Todos os grupos devem ser notificados a paralisarem suas atividades.");
                } else if (indice >= 0.4) {
                    System.out.println("As industrias do 1º e 2º grupo devem ser intimadas a suspenderem suas atividades.");
                } else if (indice >= 0.3) {
                    System.out.println("As industrias do 1º grupo devem ser intimadas a suspenderem suas atividades.");
                } else {
                    System.out.println("Nenhum grupo precisa ser notificado.");
                }

                System.out.print("Deseja encerrar o programa? (S/N): ");
                resposta = scanner.next();
            } while (!resposta.equalsIgnoreCase("S"));
        }


}
