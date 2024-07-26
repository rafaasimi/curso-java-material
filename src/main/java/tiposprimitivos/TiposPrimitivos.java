package tiposprimitivos;

/*
 * Notas de estudo sobre os tipos primitivos do Java.
 * Tipos primitivos são providos pela linguagem nativamente.
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        // Caracteres ou Characters
        char primeiraLetraDoNome = 'R';
        char primeiraLetraDoNomeASCII = 82;

        System.out.println(primeiraLetraDoNome);
        System.out.println(primeiraLetraDoNomeASCII);

        // Inteiros ou Integers
        byte nota = 10; // -128 á 127
        short itensComprados = 2; // -32768 á 32697
        int quantidadeEstoque = 22_366; // -2.147.483.648 á 2.147.483.647
        long numeroMuitoGrande = 646546548949456464L; // 19 dígitos +/-

        // Decimais
        float peso = 76.9f; // 6 á 7 casas decimais
        double preco = 24.99; // +/- 15 casas decimais

        // Booleans
        boolean verdadeiro = true;
        boolean falso = false;
    }

}
