package polimorfismo;

public class Programador implements Trabalhador{

    @Override
    public void trabalhar() {
        System.out.println("Criando programas.");
    }

    public String toString(){
        return "Programador";
    }
}
