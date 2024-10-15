package heranca.superherois;

//public final class SuperHeroi {
public abstract class SuperHeroi {

    public static final boolean tendencia = true;

    protected String traje;
    protected String[] superPoderes;

    public SuperHeroi(String traje, String[] superPoderes) {
        this.traje = traje;
        this.superPoderes = superPoderes;
    }

//    protected void usarSuperPoder(int index) {
//    public void usarSuperPoder(int index) {
//        System.out.println("Usando o super poder: " + superPoderes[index]);
//    }

    public abstract void usarSuperPoder(int index);

    public String getTraje() {
        return traje;
    }

}
