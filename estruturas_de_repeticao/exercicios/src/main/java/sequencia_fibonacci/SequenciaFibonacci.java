package sequencia_fibonacci;

import java.util.Scanner;

/*
 * A Sequência de Fibonacci é uma série matemática em que cada número subsequente
 * é a soma dos dois números anteriores. Começando com 0 e 1,
 * os primeiros termos da sequência são 0, 1, 1, 2, 3, 5, 8, 13, 21 e assim por diante.
 * Por exemplo, dado o número 7, o termo fibonacci é 13.
 *
 * Você deve criar um programa Java que permita ao usuário informar um número e calcule o termo da Sequência de Fibonacci correspondente a esse número inteiro positivo.
 */
public class SequenciaFibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular a sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        scanner.close();

        int primeiroTermo = 0, segundoTermo = 1, terceiroTermo = 0;

        if (numero <= 0) {
            terceiroTermo = primeiroTermo;
        } else if (numero == 1) {
            terceiroTermo = segundoTermo;
        } else {

            for (int i = 2; i <= numero; i++) {
                terceiroTermo = primeiroTermo + segundoTermo;
                primeiroTermo = segundoTermo;
                segundoTermo = terceiroTermo;
            }

        }

        System.out.println(terceiroTermo);
    }

}
