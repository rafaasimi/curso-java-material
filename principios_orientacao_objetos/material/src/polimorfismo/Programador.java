package polimorfismo;

public class Programador extends Empregado implements Trabalhador{

    public String nome = "Programador";

    @Override
    public void trabalhar() {
        System.out.println("Criando programas.");
    }

    public String toString(){
        return "Programador";
    }
}
