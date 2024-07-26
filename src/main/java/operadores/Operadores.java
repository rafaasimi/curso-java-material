package operadores;

public class Operadores {

    public static void main(String[] args) {

        // Operadores Aritimeticos
        somar(5, 10); // Saída 15
        subtrair(10, 20); // Saída -10
        multiplicar(2.5, -5); // Saída -12.5
        dividir(70, 9); // Saída 7.77
        modulo(71, 9); // Saída 7.77
        incrementar(10); // Saída 12

        // Operadores Relacionais
        operacoesRelacionais(5, 10);

        // Operadores Atribuição
        operacoesAtribuicao(20);

        // Operadores Logicos
        operacoesLogicas(2,6);
    }

    static void somar(int numero1, int numero2) {
        int resultado = numero1 + numero2;

        System.out.println("A soma dos números " + numero1 + " e " + numero2 + " é " + resultado);
    }

    static void subtrair(int numero1, int numero2) {
        int resultado = numero1 - numero2;

        System.out.println("A subtração dos números " + numero1 + " e " + numero2 + " é " + resultado);
    }

    static void multiplicar(double numero1, double numero2) {
        double resultado = numero1 * numero2;

        System.out.println("A multiplicação dos números " + numero1 + " e " + numero2 + " é " + resultado);
    }

    static void dividir(double numero1, double numero2) {
        double resultado = numero1 / numero2;

        // Se armazenarmos em uma variável int, será considerado somente o inteiro, descartando o decimal
        // Exemplo: 7.777777
        // Saída: 7

        System.out.println("A divisão dos números " + numero1 + " e " + numero2 + " é " + resultado);
    }

    static void modulo(int numero1, int numero2) {
        int resultado = numero1 % numero2;

        // Se armazenarmos em uma variável int, será considerado somente o inteiro, descartando o decimal
        // Exemplo: 7.888888
        // Saída: 8

        System.out.println("O resto da divisão dos números " + numero1 + " e " + numero2 + " é " + resultado);
    }

    static void incrementar(int contador) {
        // Forma 1
        // Contador atual: 11
        contador = contador + 1;

        // Forma 2
        // Contador atual: 12
        contador++;

        // Forma 3
        // Contador atual: 13
        contador += 1;

        System.out.println("O valor final incrementado é: " + contador);
    }

    static void operacoesRelacionais(int numero1, int numero2) {
        System.out.println(numero1 + " é maior que " + numero2 + ": " + (numero1 > numero2));
        System.out.println(numero1 + " é menor que " + numero2 + ": " + (numero1 < numero2));
        System.out.println(numero1 + " é maior ou igual a " + numero2 + ": " + (numero1 >= numero2));
        System.out.println(numero1 + " é menor ou igual a " + numero2 + ": " + (numero1 <= numero2));
        System.out.println(numero1 + " é igual a " + numero2 + ": " + (numero1 == numero2));
        System.out.println(numero1 + " é diferente de " + numero2 + ": " + (numero1 != numero2));
    }

    static void operacoesAtribuicao(int numero1) {
        int num = 2;

        int operacao1 = (numero1 = num);
        System.out.println(operacao1); // Saída: 2

        // numero1 = 2
        int operacao2 = (numero1 += num);
        System.out.println(operacao2); // Saída: 4

        // numero1 = 4
        int operacao3 = (numero1 -= num);
        System.out.println(operacao3); // Saída: 2

        // numero1 = 2
        int operacao4 = (numero1 *= num);
        System.out.println(operacao4); // Saída: 4

        // numero1 = 4
        int operacao5 = (numero1 /= num);
        System.out.println(operacao5); // Saída: 2

        // numero1 = 2
        int operacao6 = (numero1 %= num);
        System.out.println(operacao6); // Saída: 0
    }

    static void operacoesLogicas(int numero1, int numero2) {
        System.out.println(numero1 < numero2 && numero2 > numero1); // Saída: true
        System.out.println(numero1 > numero2 || numero2 > numero1); // Saída: true
        System.out.println(!(numero1 < numero2)); // Saída: false
    }


}
