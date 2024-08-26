package classes;

public class Matematica {
    public static Double limite = 100.0;

    public static Double soma(double numero1, double numero2) {
        double soma = numero1 + numero2;

        if (soma > limite) {
            return limite;
        } else {
            return soma;
        }

    }

    public Double somaNaoEstatica(double numero1, double numero2) {
        double soma = numero1 + numero2;

        if (soma > limite) {
            return limite;
        } else {
            return soma;
        }
    }

}
