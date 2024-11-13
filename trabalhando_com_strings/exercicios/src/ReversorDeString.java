public class ReversorDeString {

    public static void main(String[] args) {

        System.out.println(reverter("Olá, Mundo!"));

    }

    public static String reverter(String string) {

        String stringReversa = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            stringReversa += string.charAt(i);
        }

        return stringReversa;

    }

}
