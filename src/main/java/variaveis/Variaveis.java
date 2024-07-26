package variaveis;

/*
* Aula prática sobre variáveis no Java.
* As variáveis são conteiners de dados.
*/

public class Variaveis {

    public static void main(String[] args) {
        // Variáveis que representam a data atual.
        int dia = 26;
        int mes = 7;
        int ano = 2024;

        // É possível declarar váriaveis do mesmo tipo na mesma linha
        // int dia = 26, mes = 7, ano = 2024;

        // Atribuição de novo valor para o dia.
        dia = 30;

        // Impressão da data atual.
        System.out.println(dia);
        System.out.println(mes);
        System.out.println(ano);

        metodo2();
    }

    public static void metodo2() {
        int dia = 31;

        System.out.println(dia);
    }

}
