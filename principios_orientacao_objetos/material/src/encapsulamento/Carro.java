package encapsulamento;

class Carro {

    // Getters e Setters
    private String volante;
    private String pedais;

    private Motor motor;
    private String airbag;

    public Carro() {
        this.motor = new Motor();
        this.volante = "1";
        this.pedais = "3";
    }

//    private Carro() {
//        this.motor = new Motor();
//        this.volante = "1";
//        this.pedais = "3";
//    }

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

    public String getVolante() {
        return volante;
    }

    public void setVolante(String volante) {
        this.volante = volante;
    }

    public String getPedais() {
        return pedais;
    }

    public void setPedais(String pedais) {
        this.pedais = pedais;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getAirbag() {
        return airbag;
    }

    public void setAirbag(String airbag) {
        this.airbag = airbag;
    }
}
