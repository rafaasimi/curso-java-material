import java.util.ArrayList;
import java.util.List;

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

        // Insert
        System.out.println(nomesArraylist.set(0, "0"));
        System.out.println(nomesArraylist.set(1, "1"));
        System.out.println(nomesArraylist.set(2, "2"));
        System.out.println(nomesArraylist);

        // Update
        // Delete
    }

}
