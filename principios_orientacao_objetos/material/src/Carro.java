public class Carro {

    public String volante;
    public String pedais;

    private Motor motor;
    private String airbag;

    public void ligarCarro() {
        System.out.println("Ligando o carro...");
    }

    public void acelerar() {
        System.out.println("Acelerar...");
    }

    public void frear() {
        System.out.println("Frear...");
    }

    private void detectarColisao() {
        ativarAirbags();
    }

    private void ativarAirbags() {
        System.out.println("Ativando airbags...");
    }
}
