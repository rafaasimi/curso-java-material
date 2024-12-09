import java.util.ArrayList;
import java.util.List;

public class ExceptionsBasics {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Rafael");

        try {
            System.out.println(nomes.get(0));
            System.out.println(nomes.get(1));
        } catch (e) {

        }

    }

}
