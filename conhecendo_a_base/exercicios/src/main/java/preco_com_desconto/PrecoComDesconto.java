package preco_com_desconto;

import java.util.Scanner;

/*
 * Imprimir o preço de um produto com base no desconto à vista e o valor economizado.
 *
 * 1. Ler o preço
 * 2. Ler o % de desconto
 * 3. Imprimir o novo preço e valor economizado em reais
 *
 * Exemplo: R$ 100 com 10% de desconto = O preço com desconto é R$ 90,00
 * e o valor economizado foi R$ 10,00.
 */
public class PrecoComDesconto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular o valor de um produto com desconto?");

        System.out.println("Digite o valor do produto:");
        double precoProduto = scanner.nextDouble();

        System.out.println("Qual a porcentagem de desconto? (Exemplo: 15)");
        double porcentagemDesconto = scanner.nextDouble();

        scanner.close();

        calcularDesconto(precoProduto, porcentagemDesconto);

    }

    static public void calcularDesconto(double preco, double desconto) {
        double valorEconomizado = preco * (desconto / 100);
        double valorComDesconto = preco - valorEconomizado;

        System.out.printf("O preço com desconto é R$ %.2f e o valor economizado foi R$ %.2f", valorComDesconto, valorEconomizado);
    }

}
