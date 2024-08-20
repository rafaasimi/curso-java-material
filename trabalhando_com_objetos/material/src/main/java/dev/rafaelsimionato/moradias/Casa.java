package dev.rafaelsimionato.moradias;

public class Casa {
    // Sem inicialização
    // tipos primitivos: iniciam com seus valores padrão definidos pela linguagem
    // tipos de referencia (Ex: String), são inicializados como null

    // valor padrão: false
    boolean inteligente;

    // valor padrão: null
    String nome;

    public Casa() {}

    public Casa(boolean inteligente) {
        this.inteligente = inteligente;
    }

    // void: não possuí retorno
    // int: retorna um valor inteiro
    // double / String / ...
    int acenderLuz() {
        if (inteligente) {
            System.out.println("Comando de voz");
        } else {
            System.out.println("Pressionar interruptor");
        }
        return 1;
    }
}
