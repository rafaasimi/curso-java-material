package classes;

public class Matematica {
    public static final Double LIMITE_OPERACAO = 100.0;
    public static Double limite;

    static {
        limite = 100.0;
    }

    public static Double soma(double numero1, double numero2) {
        double soma = numero1 + numero2;

        if (soma > LIMITE_OPERACAO) {
            return LIMITE_OPERACAO;
        } else {
            return soma;
        }

    }

    public Double somaNaoEstatica(double numero1, double numero2) {
        double soma = numero1 + numero2;

        if (soma > LIMITE_OPERACAO) {
            return LIMITE_OPERACAO;
        } else {
            return soma;
        }
    }

}
