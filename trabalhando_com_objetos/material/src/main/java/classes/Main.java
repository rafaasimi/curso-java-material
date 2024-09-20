package classes;

import dev.rafaelsimionato.moradias.Casa;

import java.util.Arrays;
import java.util.Objects;

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
//        Double soma = Matematica.soma(2, 5);
//        Double somaNaoEstatica = new Matematica().somaNaoEstatica(10, 5);
//        System.out.println("Limite da soma: " + Matematica.limite);
//        System.out.println("Minha soma: " + soma);
//        System.out.println("Minha somaNaoEstatica: " + somaNaoEstatica);

        Usuario u1 = new Usuario();
        u1.username = "u1";

        Usuario u2 = new Usuario();
        u2.username = "u1";

        Usuario u3 = new Usuario();
        u3.username = "u1";

        Usuario u4 = new Usuario();
        u4.username = "u1";

        System.out.println(u1.equals(u2));
        System.out.println(u1);
        System.out.println(u2);

        System.out.println("String 1".equals("String 1"));

        Usuario[] array1 = { u1, u2 };
        Usuario[] array2 = { u3, u4 };

//        System.out.println(array1.equals(array2));
        System.out.println("Comparando arrays: " + Arrays.equals(array1, array2));

    }

}

class Usuario {
    String username;
    String email;
    String password;

    public String toString() {
        return "{ username: " + username + ", email: " + email + ", password: " + password + " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(username, usuario.username);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(username);
    }


}