package dev.rafaelsimionato.moradias;

public class Casa {
    // Sem inicialização
    // tipos primitivos: iniciam com seus valores padrão definidos pela linguagem
    // tipos de referencia (Ex: String), são inicializados como null

    // valor padrão: false
    public Boolean inteligente = false;

    // valor padrão: null
    public String nome;

    public Casa() {}

    public Casa(boolean inteligente) {
        this.inteligente = inteligente;
    }

    // void: não possuí retorno
    // int: retorna um valor inteiro
    // double / String / ...
    public int acenderLuz() {
        if (inteligente) {
            System.out.println("Comando de voz");
        } else {
            System.out.println("Pressionar interruptor");
        }
        return 1;
    }
}
