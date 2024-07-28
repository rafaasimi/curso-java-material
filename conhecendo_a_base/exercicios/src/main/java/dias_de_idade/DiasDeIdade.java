package dias_de_idade;

import java.util.Scanner;

/*
 * Escreva um programa que leia uma idade em anos e imprima essa idade em dias.
 *
 * Exemplo: 1 ano -> 365 dias de idade.
 */
public class DiasDeIdade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular quantos dias você já viveu?");

        System.out.println("Qual a sua idade em anos? (Exemplo: 27)");
        int idade = scanner.nextInt();

        scanner.close();

        calcularDiasDeIdade(idade);
    }

    static public void calcularDiasDeIdade(int idade) {
        int idadeEmDias = idade * 365;

        System.out.printf("Você já viveu %d dias.", idadeEmDias);
    }

}
