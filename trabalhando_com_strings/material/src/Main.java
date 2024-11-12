public class Main {
    public static void main(String[] args) {

        String texto1 = "Texto customizado";
        String texto2 = "Texto customizado";
        String outroTexto = new String("Texto customizado");

        System.out.println(texto1);
        System.out.println(outroTexto);

        System.out.println(texto1 == outroTexto);
        // Saída: false (pois é comparado o endereço de mémória)

        System.out.println(texto1.equals(outroTexto));
        // Saída: true (pois é comparado o valor dessa variavel)

        System.out.println(texto1 == texto2);
        // Saída: true (pois o conteúdo são iguais e o Java aproveita o valor do pool de strings)

        char[] texto1Array = texto1.toCharArray();
        for(char letra : texto1Array) {
            if(letra == 'a') {
                System.out.println("Encontrou a letra A.");
            }
        }

        System.out.println(texto1Array);
    }
}