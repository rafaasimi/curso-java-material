import br.com.bb.ContaBancariaBB;
import br.com.nu.ContaBancariaNu;
import carro.Carro;

public class Main {
    public static void main(String[] args) {

//        Exercicio Carro
//        Carro meuCarro = new Carro("Fusca", 2020, "Azul");
//        meuCarro.acelerar();
//        System.out.println(meuCarro.getDetalhes());

        ContaBancariaNu contaNu = new ContaBancariaNu("Udemy");
        ContaBancariaBB contaBB = new ContaBancariaBB("Udemy");

        contaNu.atualizarSaldo(50.0);

        contaBB.atualizarSaldo(50.0);
        contaBB.atualizarSaldo(-50.0);

        System.out.println(contaNu.toString());
        System.out.println(contaBB.toString());
    }
}