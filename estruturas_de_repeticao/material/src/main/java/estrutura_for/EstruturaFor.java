package estrutura_for;

import java.util.Scanner;

public class EstruturaFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcularmos o fatorial:");
        int fatorial = scanner.nextInt();

        int resultado = 1;

        for(int i = 1; i <= fatorial; i++) {
//            resultado = resultado * i;
            resultado *= i;
        }

        System.out.printf("O resultado de %d! é: %d", fatorial, resultado);
    }

}
