package saudacao_console;

import java.io.Console;

/*
 * Crie um programa que leia um nome e imprima uma saudação utilizando o
 * Console ao invés do Scanner.
 */
public class SaudacaoConsole {

    public static void main(String[] args) {

        Console console = System.console();

        System.out.println("Qual o seu nome?");
        String nome = console.readLine();
        System.out.println("Olá, " + nome);

    }

}
