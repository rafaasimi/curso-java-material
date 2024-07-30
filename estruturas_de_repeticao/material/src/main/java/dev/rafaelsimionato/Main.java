package dev.rafaelsimionato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero = 10, tentativas = 3;

        Scanner scanner = new Scanner(System.in);

        while (tentativas > 0) {

            System.out.println("Digite um número entre 1 e 10:");
            int numeroDigitado = scanner.nextInt();

            if (numeroDigitado == numero) {
                System.out.println("Parabéns! Você adivinhou o número.");
                return;
            } else {
                tentativas--;
            }

        }

        scanner.close();

    }
}