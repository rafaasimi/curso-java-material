package heranca;

import heranca.superherois.HomemAranha;
import heranca.superherois.HomemDeFerro;
import heranca.superherois.SuperHeroi;
import heranca.superherois.ViuvaNegra;

public class Main {

    public static void main(String[] args) {

        SuperHeroi[] superHerois = {
                new HomemAranha("Roupa vermelha com teias", new String[]{"Lançar teia"}),
                new HomemDeFerro("Armadura de ferro vermelha", new String[]{"Voar", "Misseis"}),
                new ViuvaNegra("Roupa preta", new String[]{"Luta"}),
        };

        validar(superHerois);

        for (SuperHeroi superHeroi : superHerois) {
            superHeroi.usarSuperPoder(0);
            System.out.println(superHeroi.getTraje());
        }
    }

    static void validar(SuperHeroi[] superHerois) {
        if (superHerois[0] instanceof HomemAranha) {
            System.out.println("Lógica de validação do Homem Aranha!");
        }
    }

}
