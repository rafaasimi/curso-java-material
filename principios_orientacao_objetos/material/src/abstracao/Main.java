package abstracao;

public class Main {

    public static void main(String[] args) {

        Televisao televisao = new Televisao();

        televisao.ligarDesligar();
        televisao.aumentarVolume();
        televisao.diminuirVolume();
        televisao.alterarCanal(25);

    }

}
