package classes;

public class Arrays {

    public static void main(String[] args) {

        int[] idades = {5, 10, 15, 20, 25, 30};

//        for (int idade: idades) {
//            System.out.println(idade);
//        }

        // Array = Tipo de referência
        // Saída de exemplo (hashcode): [I@65ab7765
        System.out.println(idades);

        // Classe Arrays (sem precisar iterar)
        // Saída: [5, 10, 15, 20, 25, 30]
        System.out.println(java.util.Arrays.toString(idades));

    }

}
