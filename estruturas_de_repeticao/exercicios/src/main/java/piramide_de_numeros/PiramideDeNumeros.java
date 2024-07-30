package piramide_de_numeros;

import java.util.Scanner;

/*
 * Crie um programa Java que lê um número n (no exemplo abaixo n é igual a 5)
 * e gera um padrão de números crescentes da seguinte forma:
 *
 * 1
 * 12
 * 123
 * 1234
 * 12345
 *
 * Dica: Utilize loops aninhados para resolver o problema.
 */
public class PiramideDeNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos imprimir uma pirâmide? Digite um número:");
        int numero = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


    }

}
