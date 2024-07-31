package percorrendo_arrays;

public class PercorrendoArrays {

    public static void main(String[] args) {

        // Definir Array
        String [] nomes = {"Rafael", "Patricia", "João", "Luiz"};

        // Percorrer / Iterar Arrays
        System.out.print("Utilizando For: ");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print(nomes[i] + " ");
        }

        System.out.println();

        System.out.print("Utilizando For Each: ");
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }

    }

}
