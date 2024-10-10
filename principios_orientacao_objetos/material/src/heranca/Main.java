package heranca;

import heranca.superherois.HomemAranha;
import heranca.superherois.HomemDeFerro;
import heranca.superherois.SuperHeroi;
import heranca.superherois.ViuvaNegra;

public class Main {

    public static void main(String[] args) {

        SuperHeroi[] superHerois = {
                new HomemAranha("Roupa vermelha com teias", new String[] {"Lançar teia"}),
                new HomemDeFerro("Armadura de ferro vermelha", new String[] {"Voar", "Misseis"}),
                new ViuvaNegra("Roupa preta", new String[] {"Luta"}),
        };

        for (SuperHeroi superHeroi : superHerois) {
            superHeroi.usarSuperPoder(0);
            System.out.println(superHeroi.getTraje());
        }

    }

}
