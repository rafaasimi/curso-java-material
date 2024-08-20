package classes;

public class Casa {
    boolean inteligente;

    public Casa() {}

    public Casa(boolean inteligente) {
        this.inteligente = inteligente;
    }

    // void: não possuí retorno
    // int: retorna um valor inteiro
    // double / String / ...
    int acenderLuz() {
        if (inteligente) {
            System.out.println("Comando de voz");
        } else {
            System.out.println("Pressionar interruptor");
        }
        return 1;
    }
}
