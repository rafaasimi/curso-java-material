package fatorial;

import java.util.Scanner;

/*
 * Você deve criar um programa Java que permita ao usuário calcular o fatorial de um número inteiro positivo.
 * Lembre-se de que o fatorial de um número n é o produto de todos os inteiros positivos de 1 a n.
 *
 * Por exemplo, se o usuário informar o número 7, o programa deve imprimir o fatorial de 7 que é 5040.
 */
public class Fatorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcularmos o seu fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.printf("O fatorial de %d! é: %d", numero, fatorial);

    }

}
