import java.util.*;

public class CollectionsBasics {

    public static void main(String[] args) {

//        String[] nomes = new String[3];
        String[] nomes = {"Rafael", "Pedro", "Luiz"};

//        ArrayList<String> nomesArraylist = new ArrayList<>();
        List<String> nomesArraylist = new ArrayList<>() {{
            add("1");
            add("2");
            add("3");
        }};

        // Adicionar elementos
        nomesArraylist.add("4");
        nomesArraylist.add("5");
        nomesArraylist.add("6");

        System.out.println(nomesArraylist);

        // Get
        System.out.println(nomesArraylist.get(1));

        // Insert / Update
        nomesArraylist.set(0, "3");
        nomesArraylist.set(1, "2");
        nomesArraylist.set(2, "1");
        System.out.println(nomesArraylist);

        // Delete
        nomesArraylist.remove(1);
        nomesArraylist.remove("6");

        System.out.println(nomesArraylist);

        // Sort
        Collections.sort(nomesArraylist);
        System.out.println(nomesArraylist);

        // Percorrendo um ArrayList
        // For
        for (String nome : nomesArraylist) {
            System.out.println(nome);
        }

        // Iterator
        Iterator<String> it = nomesArraylist.iterator();
        while (it.hasNext()) {
            String itemAtual = it.next();
            System.out.println(itemAtual);
        }

        // Conversões entre Array e ArrayList
        List<String> listaDeNomes = List.of("Rafael", "Joao", "Luiz");
        System.out.println(listaDeNomes);

        // Array para List
        String[] arrayDeNomes = {"Rafael", "Joao", "Luiz"};
        List<String> listaConvertida = Arrays.asList(arrayDeNomes);
        System.out.println(listaConvertida);

        // List para Array
        String[] arrayConvertido = listaConvertida.toArray(new String[0]);
        System.out.println(Arrays.toString(arrayConvertido));
    }

}
