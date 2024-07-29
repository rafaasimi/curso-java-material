package categoria;

import java.util.Scanner;

/*
 * Crie uma calculadora que dados 2 números e uma operação
 * (adição, subtração, multiplicação ou divisão) e retorne o resultado
 * dessa operação entre os dois números.
 */
public class Categoria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual operação matemática você deseja fazer?");
        System.out.println("Adição (+) | Substração (-) | Multiplicação (*) | Divisão (/)");
        System.out.println("Informe a operação:");
        String operacao = scanner.nextLine();

        System.out.println("Informe o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Informe o segundo número:");
        int numero2 = scanner.nextInt();

        scanner.close();

        switch (operacao) {
            case "+" -> adicao(numero1, numero2);
            case "-" -> subtracao(numero1, numero2);
            case "*" -> multiplicacao(numero1, numero2);
            case "/" -> divisao(numero1, numero2);
            default -> System.out.println("Operação inválida");
        }

    }

    public static void adicao(int numero1, int numero2) {
        int resultado = numero1 + numero2;

        System.out.printf("O resultado da soma entre %d e %d é: %d", numero1, numero2, resultado);
    }

    public static void subtracao(int numero1, int numero2) {
        int resultado = numero1 - numero2;

        System.out.printf("O resultado da subtração entre %d e %d é: %d", numero1, numero2, resultado);
    }

    public static void multiplicacao(int numero1, int numero2) {
        int resultado = numero1 * numero2;

        System.out.printf("O resultado da multiplicacao entre %d e %d é: %d", numero1, numero2, resultado);
    }

    public static void divisao(int numero1, int numero2) {
        double resultado = numero1 / (double) numero2;

        System.out.printf("O resultado da divisão entre %d e %d é: %.2f", numero1, numero2, resultado);
    }

}
