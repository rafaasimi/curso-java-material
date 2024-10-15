package heranca.superherois;

public class HomemAranha extends SuperHeroi implements Avenger{

    public HomemAranha(String traje, String[] superPoderes) {
        super(traje, superPoderes);

        // super.usarSuperPoder(2);
    }

    public void usarSuperPoder(int index) {
        System.out.println(superPoderes[index]);
    }

    public boolean isLeader() {
        return false;
    }
}
