package polimorfismo;

public class Main {

    public static void main(String[] args) {
        Trabalhador[] trabalhadores = {new Programador(), new Cozinheiro()};
//        Trabalhador programador = new Programador();
//        Trabalhador cozinheiro = new Cozinheiro();

//        programador.trabalhar();
//        cozinheiro.trabalhar();

        trabalhar(trabalhadores);

    }

    private static void trabalhar(Trabalhador[] trabalhadores) {
        for(Trabalhador trabalhador : trabalhadores) {
            trabalhador.trabalhar();

            if(trabalhador instanceof Cozinheiro) {
                ((Cozinheiro) trabalhador).temperarComida();
            }
        }
    }

}
