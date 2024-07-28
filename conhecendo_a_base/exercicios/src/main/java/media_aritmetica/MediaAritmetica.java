package media_aritmetica;

import java.util.Scanner;

/*
 * Exercicio 1:
 * Dadas 3 notas, imprimir a média aritmética do aluno.
 *
 * 1. Ler 3 notas
 * 2. Calcular média
 * 3. Imprimir resultado
 *
 * Fórmula: MA = (n1 + n1 + n3) / 3;
 */
public class MediaAritmetica {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular a média aritimética do Aluno?");

        System.out.println("Digite a nota 1:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 3:");
        double nota3 = scanner.nextDouble();

        scanner.close();

        calcularMediaAritmetica(nota1, nota2, nota3);

    }

    public static void calcularMediaAritmetica(double nota1, double nota2, double nota3) {
        double resultadoMediaAritmetica = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média aritmética do aluno foi de: %.2f", resultadoMediaAritmetica);
    }

}
