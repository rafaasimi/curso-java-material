package classes;

import dev.rafaelsimionato.moradias.Casa;

public class Main {

    public static void main(String[] args) {

//        Casa casa1 = new Casa();
//        Casa casa2 = new Casa(true);
//        Casa casa3 = new Casa(true);
//
//        System.out.println(casa1.inteligente);
//        System.out.println(casa1.nome);
//
//        casa2.acenderLuz();
//        casa3.acenderLuz();

//        Double soma = new Matematica().soma(2, 5);
        Double soma = Matematica.soma(2, 5);
        Double somaNaoEstatica = new Matematica().somaNaoEstatica(10, 5);
        System.out.println("Limite da soma: " + Matematica.limite);
        System.out.println("Minha soma: " + soma);
        System.out.println("Minha somaNaoEstatica: " + somaNaoEstatica);

    }

}
