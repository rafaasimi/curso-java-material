import java.util.ArrayList;
import java.util.List;

public class ExceptionsBasics {

    public static void main(String[] args) throws Exception {

        List<String> nomes = new ArrayList<>();
        nomes.add("Rafael");

        getNomes(nomes);
//        dividir(1, 0);
        dividirNovo(1, 0);
    }

    private static int dividir(int i, int j) throws Exception {
        if (j == 0) {
            // Exceção checável (Exception)
            throw new Exception("Não é possível realizar divisão por zero.");
        }

        return i / j;
    }

    private static int dividirNovo(int i, int j) throws Exception {
        if (j == 0) {
            // Exceção não checável (RunTimeException)
//            throw new IllegalArgumentException("Não é possível realizar divisão por zero.");
            throw new DivisaoPorZero("Não é possível realizar divisão por zero.");

        }

        return i / j;
    }


    private static void getNomes(List<String> nomes) {
        System.out.println(nomes.get(0));

        try {
            System.out.println(nomes.get(1));
            int resultado = 10 / 0;

        } catch (IndexOutOfBoundsException ex) {
            // ex.printStackTrace();
            System.out.println("O indice informado não é válido.");
        } catch (ArithmeticException ex) {
            System.out.println("Operação aritimética inválida.");
        }
    }

}
