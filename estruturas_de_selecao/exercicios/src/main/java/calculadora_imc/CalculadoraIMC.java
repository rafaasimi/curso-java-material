package calculadora_imc;

import java.util.Scanner;

/*
 * Crie uma calculadora de IMC que mostra em que classificação a pessoa está:
 *
 * Menor que 18,5 -> Magreza
 * Entre 18,5 e 24,9 -> Normal
 * Entre 25 e 29,9 -> Sobrepreso
 * Entre 30 e 39,9 -> Obesidade
 * Maior que 40 -> Obesidade Grave
 *
 * Fórmula: IMC = peso / altura * altura
 */
public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular seu IMC?");

        System.out.println("Informe o seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Informe a sua altura:");
        double altura = scanner.nextDouble();

        scanner.close();

        calcularIMC(peso, altura);

    }

    public static void calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.printf("Seu IMC (%.2f) está na categoria: Magreza", imc);
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf("Seu IMC (%.2f) está na categoria: Normal", imc);
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.printf("Seu IMC (%.2f) está na categoria: Sobrepeso", imc);
        } else if (imc >= 30 && imc <= 39.9) {
            System.out.printf("Seu IMC (%.2f) está na categoria: Obesidade", imc);
        } else {
            System.out.printf("Seu IMC (%.2f) está na categoria: Obesidade Grave", imc);
        }
    }

}
