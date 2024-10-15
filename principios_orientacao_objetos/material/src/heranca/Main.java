package heranca;

import heranca.superherois.*;

public class Main {

    public static void main(String[] args) {

        SuperHeroi[] superHerois = {
                new HomemAranha("Roupa vermelha com teias", new String[]{"Lançar teia"}),
                new HomemDeFerro("Armadura de ferro vermelha", new String[]{"Voar", "Misseis"}),
                new ViuvaNegra("Roupa preta", new String[]{"Luta"}),
//                new SuperHeroi("Roupa preta", new String[]{"Luta"})
        };

        System.out.println(superHerois[0].tendencia);
        System.out.println(SuperHeroi.tendencia);
//        superHerois[0].tendencia = false;

        Avenger avenger = new HomemAranha("Roupa vermelha com teias", new String[]{"Lançar teia"});
        avenger.enterBuilding();

        validar(superHerois);

        for (SuperHeroi superHeroi : superHerois) {
            superHeroi.usarSuperPoder(0);
            System.out.println(superHeroi.getTraje());
        }
    }

    static void validar(SuperHeroi[] superHerois) {

//        No Java, todas as classes são subclasses diretas ou indiretas
//        da classe Object. Por isso, elas herdam métodos da classe Object.

//        if (superHerois[0] instanceof Object) {
//            // true
//        }

        if (superHerois[0] instanceof HomemAranha) {
            System.out.println("Lógica de validação do Homem Aranha!");
        }
    }

}
