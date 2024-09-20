package jogo_de_monstros;

public class Jogador {
    public String nome;
    public static int placarGeral;
    public int placarIndividual;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void derrotarMonstro() {
        this.placarIndividual++;
        placarGeral++;
    }

    public boolean equals(Object jogador) {
        return this.nome.equals(((Jogador) jogador).nome);
    }

}

