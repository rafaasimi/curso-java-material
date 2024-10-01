package abstracao;

public class Televisao {

    private boolean ligada;
    private int volume;
    private int canal;

    public void ligarDesligar() {
        this.ligada = !this.ligada;
        System.out.println("A televisão está: " + (this.ligada ? "ligada" : "desligada"));
    }

    public void aumentarVolume() {
        this.volume++;
        System.out.println("Volume aumentado para: " + this.volume);
    }

    public void diminuirVolume() {
        this.volume--;
        System.out.println("Volume diminuído para: " + this.volume);
    }

    public void alterarCanal(int canal) {
        this.canal = canal;
        System.out.println("Canal alterado para: " + this.canal);
    }

}
