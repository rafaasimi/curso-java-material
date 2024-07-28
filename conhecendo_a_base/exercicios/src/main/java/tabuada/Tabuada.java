package tabuada;

import java.util.Scanner;

/*
 * Imprimir a tabuada de um número.
 * 1. ler um número
 * 2. Imprimir sua tabuada
 *
 * 1 a 10
 * Exemplo: 1x1=1 | 1x2=2
 */
public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a tabuada você quer ver? (Exemplo: 5):");
        int numero = scanner.nextInt();

        scanner.close();

        multiplicacao(numero);

    }

    public static void multiplicacao(int numero) {
        System.out.printf("A tabuada do %d é: \n", numero);

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + "x" + i + "=" + resultado);
        }

    }

}
