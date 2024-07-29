package area_figura_geometrica;

import java.util.Scanner;

/*
 * Dada uma figura geométrica (retângulo, triângulo, círculo) selecione a sua área.
 *
 * Retângulo = base x altura
 * Triângulo = (base x altura) / 2
 * Círculo = pi x (radio * radio)
 */
public class AreaFiguraGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você deseja calcular a área de qual figura geométrica?");
        System.out.println("1. Retângulo | 2. Triângulo | 3. Círculo");
        System.out.println("Você deseja calcular a área de qual figura geométrica? Informe o número:");
        int figura = scanner.nextInt();


        switch (figura) {
            case 1 -> {
                System.out.println("Informe a base (cm):");
                double base = scanner.nextDouble();

                System.out.println("Informe a altura (cm):");
                double altura = scanner.nextDouble();

                calcularAreaRetangulo(base, altura);
            }
            case 2 -> {
                System.out.println("Informe a base (cm):");
                double base = scanner.nextDouble();

                System.out.println("Informe a altura (cm):");
                double altura = scanner.nextDouble();

                calcularAreaTriangulo(base, altura);
            }
            case 3 -> {
                System.out.println("Informe o raio (cm):");
                double raio = scanner.nextDouble();

                calcularAreaCirculo(raio);
            }
            default -> System.out.println("Figura inválida.");
        }

        scanner.close();

    }

    public static void calcularAreaRetangulo(double base, double altura) {
        double area = base * altura;
        System.out.printf("A área do retângulo é de: %.2f cm².", area);
    }

    public static void calcularAreaTriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        System.out.printf("A área do triângulo é de: %.2f cm².", area);
    }

    public static void calcularAreaCirculo(double raio) {
        double area = 3.14 * (raio * raio);
        System.out.printf("A área do círculo é de: %.2f cm².", area);
    }


}
