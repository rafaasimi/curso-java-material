public class Palindromo {

    public static boolean isPalindromo(String valor) {

        String textoFormatado = "";

        for (char letra : valor.toCharArray()) {
            if(!Character.isWhitespace(letra)) {
                textoFormatado += letra;
            }
        }

        String textoReverso = ReversorDeString.reverter(textoFormatado);

        return textoFormatado.toLowerCase().equals(textoReverso.toLowerCase());
    }

}
