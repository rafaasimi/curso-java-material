package polimorfismo;

public class ImpostoPessoaJuridica implements Imposto {

    private double rendaAnual;

    public ImpostoPessoaJuridica(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public double calcularImposto() {
        return this.rendaAnual * 0.1;
    }

    public double getRendaAnual() {
        return this.rendaAnual;
    }
}
