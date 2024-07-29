package par_impar;

import java.util.Scanner;

/*
 * Leia um número e imprima se ele é par ou ímpar.
 */
public class ParImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        scanner.close();

        validarParOuImpar(numero);

    }

    public static void validarParOuImpar(int numero) {
        int modulo = numero % 2;

        if (modulo == 0) {
            System.out.printf("O número %d é um número par.", numero);
        } else {
            System.out.printf("O número %d é um número ímpar.", numero);
        }
    }

}
