package heranca.superherois;

public class SuperHeroi {

    protected String traje;
    protected String[] superPoderes;

    public SuperHeroi(String traje, String[] superPoderes) {
        this.traje = traje;
        this.superPoderes = superPoderes;
    }

//    protected void usarSuperPoder(int index) {
    public void usarSuperPoder(int index) {
        System.out.println("Usando o super poder: " + superPoderes[index]);
    }

    public String getTraje() {
        return traje;
    }

}
