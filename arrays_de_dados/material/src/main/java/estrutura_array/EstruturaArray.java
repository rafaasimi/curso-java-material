package estrutura_array;

public class EstruturaArray {

    public static void main(String[] args) {

        // Declarar Inicialização
        String[] tarefas = {"Estudar Java", "Fazer exercícios", "Tomar café"};

        // Acessar posições do Array
        System.out.println(tarefas[0]);
        System.out.println(tarefas[1]);
        System.out.println(tarefas[2]);

        // Atualizar posições do Array
        tarefas[2] = "Limpar casa";
        System.out.println(tarefas[2]);

        // Tamanho do Array
        System.out.printf("Você possuí %d tarefas.", tarefas.length);

    }

}
