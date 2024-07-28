package conversor_dolar_real;

import java.util.Scanner;

/*
 * Faça um programa que converta um valor em dólar em reais.
 *
 * Exemplo:
 * Dólares: 100
 * Cotação: 4,92
 * O valor em reais é R$ 492,00
 */
public class ConversorDolarReal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor em dólar:");
        double valorEmDolar = scanner.nextDouble();

        System.out.println("Digite a cotação atual do dólar:");
        double cotacaoDolar = scanner.nextDouble();

        scanner.close();

        converterMoeda(valorEmDolar, cotacaoDolar);

    }

    public static void converterMoeda(double valorDolar, double cotacaoDolar) {
        double valorEmReal = valorDolar * cotacaoDolar;

        System.out.printf("O valor em reais é de R$ %.2f", valorEmReal);
    }

}
