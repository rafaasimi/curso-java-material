import java.util.Arrays;

public class Forca {

    private char[] forca;
    private String palavra;
    private Integer tentativas;

    public Forca(String palavra, int tentativas) {
        this.palavra = palavra;
        this.tentativas = tentativas;
        this.forca = "_".repeat(palavra.length()).toCharArray();
    }

    public void fazerPalpite(char palpite) {

        if (tentativas == 0) {
            return;
        }

        boolean acertou = false;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == palpite) {
                forca[i] = palpite;
                acertou = true;
            }
        }

        if (!acertou) {
            tentativas--;
        }
    }

    public String exibirForca() {
        if (tentativas > 0) {
            return Arrays.toString(forca);
        } else {
            return "A palavra era %s. Você possui %d tentativas.".formatted(palavra, tentativas);
        }
    }

}
