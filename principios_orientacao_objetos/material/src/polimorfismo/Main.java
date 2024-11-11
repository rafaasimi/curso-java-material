package polimorfismo;

public class Main {

    public static void main(String[] args) {
        Trabalhador programador = new Programador();
        Trabalhador cozinheiro = new Cozinheiro();

        programador.trabalhar();
        cozinheiro.trabalhar();
    }

}
