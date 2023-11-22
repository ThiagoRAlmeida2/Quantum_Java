package lista1;

import java.util.Scanner;

public class questao3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu ID:");
        int id = scan.nextInt();

        System.out.println("QUal é o codigo da peça?");
        int Codigopç = scan.nextInt();

        System.out.println("Qual é o preço unitario:");
        double preço = scan.nextDouble();

        System.out.println("Qual foi a quantidade vendida?");
        int venda = scan.nextInt();

        double total = venda * preço;
        double comissao = total * 0.5;

        System.out.println("Identificação do Vendedor: " + id);
        System.out.println("Código da Peça: " + Codigopç);
        System.out.println("Preço Unitário da Peça: R$" + preço);
        System.out.println("Quantidade Vendida: " + venda);
        System.out.println("Total da Venda: R$" + total);
        System.out.println("Comissão do Vendedor (5%): R$" + comissao);

        scan.close();


    }
}
