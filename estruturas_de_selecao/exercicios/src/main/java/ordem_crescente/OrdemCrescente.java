package ordem_crescente;

import java.util.Scanner;

/*
 * Leia 3 números e imprima-os em ordem crescente.
 */
public class OrdemCrescente {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos ordenar alguns números?");

        System.out.println("Digite o número 1:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o número 2:");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o número 3:");
        int numero3 = scanner.nextInt();

        scanner.close();

        ordenarNumeros(numero1, numero2, numero3);

    }

    public static void ordenarNumeros(int numero1, int numero2, int numero3) {

        // Imprimir o menor número
        if (numero1 < numero2 && numero1 < numero3) {
            System.out.println(numero1);

            if (numero2 < numero3) {
                System.out.println(numero2);
                System.out.println(numero3);
            } else {
                System.out.println(numero3);
                System.out.println(numero2);
            }

        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println(numero2);

            if (numero1 < numero3) {
                System.out.println(numero1);
                System.out.println(numero3);
            } else {
                System.out.println(numero3);
                System.out.println(numero1);
            }
        } else {
            System.out.println(numero3);

            if (numero1 < numero2) {
                System.out.println(numero1);
                System.out.println(numero2);
            } else {
                System.out.println(numero2);
                System.out.println(numero1);
            }
        }


    }

}
