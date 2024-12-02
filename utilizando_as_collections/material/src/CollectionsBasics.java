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

        nomesArraylist.add("1");
        nomesArraylist.add("2");
        nomesArraylist.add("3");

        System.out.println(nomesArraylist);
    }

}
