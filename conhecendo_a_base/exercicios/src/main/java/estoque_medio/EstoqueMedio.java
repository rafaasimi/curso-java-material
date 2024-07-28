package estoque_medio;

import java.util.Scanner;

/*
 * Faça um programa para calcular o estoque médio de uma peça, seguindo a fórmula:
 * estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2
 *
 * Exemplo: quantidadeMinima = 3; quantidadeMaxima = 7
 * O estoque médio é de 5 unidades.
 *
 * 1. Ler a quantidade mínima e máxima do produto
 * 2. Calcular o estoque médio
 * 3. Imprimir mensagem para o usuário com o resultado
 */
public class EstoqueMedio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular o estoque médio do produto?");

        System.out.println("Qual a quantidade mínima desse produto?");
        int quantidadeMinima = scanner.nextInt();

        System.out.println("Qual a quantidade máxima desse produto?");
        int quantidadeMaxima = scanner.nextInt();

        scanner.close();

        calcularEstoqueMedio(quantidadeMinima, quantidadeMaxima);

    }

    public static void calcularEstoqueMedio(int quantidadeMinima, int quantidadeMaxima) {
        double estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2.0;

        System.out.printf("O estoque médio é de %.2f unidades.", estoqueMedio);
    }

}
