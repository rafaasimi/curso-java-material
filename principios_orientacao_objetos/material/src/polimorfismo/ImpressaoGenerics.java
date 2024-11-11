package polimorfismo;

import java.util.Arrays;

public class ImpressaoGenerics {

    public static void main(String[] args) {
        Trabalhador[] trabalhadores = {new Programador(), new Cozinheiro()};

        imprimir(trabalhadores);
        imprimir(new Integer[] {1, 2, 3});
        imprimir(new String[] {"Texto 1", "Texto 2", "Texto 3"});
    }

//    private static void imprimir(Trabalhador[] trabalhadores) {
//        System.out.println(Arrays.toString(trabalhadores));
//    }

    private static <T> void imprimir(T[] trabalhadores) {
        System.out.println(Arrays.toString(trabalhadores));
    }


}
