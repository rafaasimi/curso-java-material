package polimorfismo;

public class Cozinheiro implements Trabalhador{

    @Override
    public void trabalhar() {
        System.out.println("Fazer comida.");
    }
}
