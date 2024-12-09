import java.util.ArrayList;
import java.util.List;

public class ExceptionsBasics {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Rafael");

        getNomes(nomes);

    }

    private static void getNomes(List<String> nomes) {
        System.out.println(nomes.get(0));

        try {
            System.out.println(nomes.get(1));
        } catch(IndexOutOfBoundsException ex) {
            // ex.printStackTrace();
            System.out.println("O indice informado não é válido.");
        }
    }

}
