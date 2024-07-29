package aprovado_reprovado;

import java.util.Scanner;

/*
 * Leia 3 notas de um aluno e imprima se ele foi aprovado ou não.
 * Obs: O aluno deve possuir média 7.0 ou maior para ser aprovado.
 */
public class AprovadoReprovado {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular a média do aluno?");

        System.out.println("Digite a nota 1:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 3:");
        double nota3 = scanner.nextDouble();

        scanner.close();

        calcularMedia(nota1, nota2, nota3);

    }

    public static void calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7) {
            System.out.printf("Parabéns! Aluno aprovado com média %.2f", media);
        } else {
            System.out.printf("Infelizmente o aluno foi reprovado com média %.2f", media);
        }
    }

}
