package casting;

/*
 * Casting: Operação de transformar um tipo de dados em outro.
 * Widening Casting vs Narrowing Casting
 * Widening: Alargar
 * Narrowing: Estreitar
 */
public class Casting {

    public static void main(String[] args) {

        // Widening Casting (Implícito)
        byte variavelPequena = 1;
        int variavelGrande = variavelPequena;

        short variavelShort = 10;
        int variavelInt = variavelShort;

        System.out.println(variavelGrande);
        System.out.println(variavelInt);

        // Narrowing Casting (Explícito)
        long variavelLong = 654654564568897L;
        int variavelInteira = (int) variavelLong;

        System.out.println(variavelInteira);

        // Operações de divisão entre números inteiros
        int numero1 = 9;
        int numero2 = 2;
        float resultadoDivisao = (float) numero1 / numero2;

        System.out.println(resultadoDivisao);

    }

}
