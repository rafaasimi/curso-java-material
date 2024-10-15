package heranca.superherois;

import java.util.Arrays;

public class HomemDeFerro extends SuperHeroi implements Avenger{

    public HomemDeFerro(String traje, String[] superPoderes) {
        super(traje, superPoderes);
        System.out.println("Homem de Ferro!");
    }

    public void usarSuperPoder(int index) {
        System.out.println("Falar com Jarvis");
        System.out.println(Arrays.toString(super.superPoderes));
//        super.usarSuperPoder(index);
    }

    public boolean isLeader() {
        return true;
    }
}
