package array_tarefas;

import java.util.Scanner;

public class ArrayTarefas {

    public static void main(String[] args) {
        String[] tarefas = new String[]{
                "x", "x", "x", "x", "x", "x", "x", "x", "x", "x"};

        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Lê opção (1 - Cadastrar, 2 - Exibir, Qualquer outra - Sair)
            System.out.println("\nOpções:");
            System.out.println("1. Cadastrar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o número da tarefa (1-10): ");
                    int numeroTarefa = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do teclado

                    if (numeroTarefa <= 0 || numeroTarefa > 10) {
                        System.out.println("Número da tarefa inválido.");
                        continue;
                    }

                    System.out.println("Digite a descrição da tarefa:");
                    String descricaoTarefa = scanner.nextLine();

                    tarefas[numeroTarefa - 1] = descricaoTarefa;
                }
                case 2 -> {
                    for (int i = 0; i < tarefas.length; i++) {
                        System.out.printf("Tarefa %d - %s", i + 1, tarefas[i]);
                        System.out.println();
                    }
                    return;
                }
                default -> {
                    System.out.println("Encerrando programa...");
                    scanner.close();
                    return;
                }
            }
        }
    }

}
