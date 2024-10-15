package heranca.superherois;

public class ViuvaNegra extends SuperHeroi {

    public ViuvaNegra(String traje, String[] superPoderes) {
        super(traje, superPoderes);
    }

    public void usarSuperPoder(int index) {
        System.out.println(superPoderes[index]);
    }
}
