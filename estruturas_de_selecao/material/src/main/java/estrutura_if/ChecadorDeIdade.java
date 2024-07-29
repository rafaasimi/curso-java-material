package estrutura_if;

import java.util.Scanner;

public class ChecadorDeIdade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();

        scanner.close();

        validarIdade(idade);
    }

    public static void validarIdade(int idade) {

//        if (idade >= 18) {
//            System.out.println("Você pode assistir esse filme.");
//        } else {
//            System.out.println("Esse filme é para maiores de 18 anos.");
//        }

//        if (idade >= 18)
//            System.out.println("Você pode assistir esse filme.");
//        else
//            System.out.println("Esse filme é para maiores de 18 anos.");

        // If ternário: condicao ? expressao1 : expressao2
        String mensagem = (idade >= 18) ? "Você pode assistir esse filme." : "Esse filme é para maiores de 18 anos.";
        System.out.println(mensagem);

    }

}
