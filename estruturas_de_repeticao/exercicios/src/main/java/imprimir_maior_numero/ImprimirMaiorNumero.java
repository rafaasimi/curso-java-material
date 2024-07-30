package imprimir_maior_numero;

import java.util.Scanner;

/*
 * Crie um programa Java que solicita ao usuário uma série de números e quando ele digitar um número negativo,
 * o programa irá encerrar e imprimir o maior número entre os digitados.
 * Você deve utilizar estruturas de repetição para coletar os números e determinar qual é o maior.
 *
 * Ex: Suponha que o usuário insira os seguintes números: 5, 12, 8, 25, 3, -1. A saída do programa deve ser: 25.
 */
public class ImprimirMaiorNumero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maiorNumero = 0;
        boolean controle = true;

        do {
            System.out.println("Digite um número: ");
            int numeroDigitado = scanner.nextInt();

            if (numeroDigitado > maiorNumero) {
                maiorNumero = numeroDigitado;
            }

            if (numeroDigitado < 0) {
                controle = false;
            }

        } while (controle);

        System.out.println(maiorNumero);

    }

}
