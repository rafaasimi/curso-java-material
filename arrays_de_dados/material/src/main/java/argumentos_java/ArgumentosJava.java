package argumentos_java;

public class ArgumentosJava {

    public static void main(String[] args) {

        // $ java ArgumentosJava "Estudar Java" "Fazer exercícios"
        for (String arg : args) {
            System.out.println(arg);
        }

    }

}
