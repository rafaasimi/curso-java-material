package heranca.superherois;

public class ViuvaNegra extends SuperHeroi implements Avenger{

    public ViuvaNegra(String traje, String[] superPoderes) {
        super(traje, superPoderes);
    }

    public void usarSuperPoder(int index) {
        System.out.println(superPoderes[index]);
    }

    public boolean isLeader() {
        return false;
    }
}
