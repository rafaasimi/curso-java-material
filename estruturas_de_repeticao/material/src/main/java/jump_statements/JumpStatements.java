package jump_statements;

import java.util.Scanner;

public class JumpStatements {

    public static void main(String[] args) {

//        metodoContinue();
//        metodoBreak();
        metodoReturn();

    }

    public static void metodoContinue() {
        // continue
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                // pula o restante do fluxo
                // e vá direto para a proxima iteração
                continue;
            }
            System.out.println(i);
        }
    }

    public static void metodoBreak() {
        // break
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero == 1) {
                break;
            }
        }
        scanner.close();
        System.out.println("Ufa, consegui sair do while.");
    }

    public static void metodoReturn() {
        // return
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero == 1) {
                scanner.close();
                System.out.println("Finalizei o looping.");
                return;
            }
        }
    }

}
