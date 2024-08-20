package classes;

public class Main {

    public static void main(String[] args) {

        Casa casa1 = new Casa();
        Casa casa2 = new Casa(true);
        Casa casa3 = new Casa(true);

        casa1.inteligente = true;
        casa1.acenderLuz();

        casa2.acenderLuz();
        casa3.acenderLuz();

    }

}
