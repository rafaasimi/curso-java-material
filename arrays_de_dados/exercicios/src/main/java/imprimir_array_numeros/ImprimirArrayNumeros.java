package imprimir_array_numeros;

import java.util.Scanner;


/*
 * Crie um programa que lê um número inteiro n que representa a quantidade de números a serem inseridos pelo usuário e,
 * em seguida, lê esses n números, e finalmente os imprime de volta ao usuário.
 *
 * Obs: Cada número deve ser impresso numa linha separada.
 * Além disso a impressão deve ser feita depois da leitura de todos os números, e não durante.
 */
public class ImprimirArrayNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quandos números você quer digitar? ");
        int quantidade = scanner.nextInt();
        int[] numeros = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Digite o número da posição %d: ", i + 1);
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Os números digitados foram: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        scanner.close();

    }

}
