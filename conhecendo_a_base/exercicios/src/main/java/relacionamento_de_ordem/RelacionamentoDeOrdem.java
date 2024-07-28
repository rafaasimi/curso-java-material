package relacionamento_de_ordem;

import java.util.Scanner;


/*
 * Escreva um programa que informe os relacionamentos de ordem existentes
 * Igual, não igual, maior, menor, maior ou igual, menor ou igual.
 *
 * 1. Ler 2 números
 * 2. Imprimir relacionamntos de ordem
 *
 * Ex: Dados os numeros 2 e 3:
 * 2 = 3 ? false; 2 != 3 ? true ...
 */
public class RelacionamentoDeOrdem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos verificar qual a relação entre dois nuemros?");

        System.out.println("Digite o primeiro numero:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo numero:");
        int numero2 = scanner.nextInt();

        scanner.close();

        validarRelacionamento(numero1, numero2);

    }

    public static void validarRelacionamento(int numero1, int numero2) {
        System.out.println(numero1 + " = " + numero2 + " ? " + (numero1 == numero2));
        System.out.println(numero1 + " != " + numero2 + " ? " + (numero1 != numero2));
        System.out.println(numero1 + " > " + numero2 + " ? " + (numero1 > numero2));
        System.out.println(numero1 + " < " + numero2 + " ? " + (numero1 < numero2));
        System.out.println(numero1 + " >= " + numero2 + " ? " + (numero1 >= numero2));
        System.out.println(numero1 + " <= " + numero2 + " ? " + (numero1 <= numero2));
    }

}
