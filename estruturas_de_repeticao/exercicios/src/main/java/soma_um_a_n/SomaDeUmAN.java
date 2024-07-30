package soma_um_a_n;

import java.util.Scanner;

/*
 * Escreva um programa Java que imprima a soma dos números de 1
 * até um número inteiro positivo N, onde N é fornecido pelo usuário.
 * O programa deve solicitar ao usuário que insira o valor de N e,
 * em seguida, calcular e exibir a soma dos números de 1 até N.
 *
 *Ex: Se N = 5, a soma de 1 a N será 15.
 */
public class SomaDeUmAN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número para somar: ");
        int numero = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }

        System.out.println(soma);

    }

}
