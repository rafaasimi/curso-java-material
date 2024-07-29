package categoria_atleta;

import java.util.Scanner;

/*
 * Dada a idade do atleta, imprima sua categoria
 *
 * Mirin: 10 a 12 anos
 * infantil: 13 a 15 anos
 * juvenil 16 a 18 anos
 */
public class CategoriaAtleta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para verificar qual a sua categoria, informe sua idade:");
        int idade = scanner.nextInt();

        scanner.close();

        verificarCategoria(idade);

    }

    public static void verificarCategoria(int idade) {

        if (idade >= 10 && idade <= 12) {
            System.out.println("Você está na categoria mirim.");
        } else if (idade >= 13 && idade <= 15) {
            System.out.println("Você está na categoria infantil.");
        } else if (idade >= 16 && idade <= 18) {
            System.out.println("Você está na categoria juvenil.");
        } else {
            System.out.println("Você não está em nenhuma categoria.");
        }

    }

}
