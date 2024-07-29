package estrutura_switch;

import java.util.Scanner;

public class ChecadorDeNotas {

    public static void main(String[] args) {
        // A, B, C, D, E ou F

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe qual foi a nota do aluno (A,B,C,D,E,F):");
        String nota = scanner.nextLine();

        verificarNota(nota);

    }

    public static void verificarNota(String nota) {

        String mensagem = switch (nota) {
            case "A" -> "Exelente!";
            case "B" -> "Bom trabalho!";
            case "C" -> "Está progredindo!";
            case "D" -> "Precisa melhorar!";
            case "E" -> "Atenção, quase reprovado!";
            case "F" -> "Você falhou!";
            default -> "Opção inválida.";
        };

        System.out.println(mensagem);

    }


}
