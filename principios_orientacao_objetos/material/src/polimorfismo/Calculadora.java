package polimorfismo;

public class Calculadora {

    public static void main(String[] args) {
//        System.out.println(somaInteiros(1, 1));
//        System.out.println(somaDoubles(2.0, 2.0));

        System.out.println(soma(1, 1));
        System.out.println(soma(2.0, 2.0));
    }

//    static int somaInteiros(int a, int b) {
//        return a + b;
//    }
//
//    static double somaDoubles(double a, double b) {
//        return a + b;
//    }

    static int soma(int a, int b) {
        return a + b;
    }

    static double soma(double a, double b) {
        return a + b;
    }

}
