package polimorfismo;

public class ImpostoPessoaFisica implements Imposto {

    private double rendaAnual;

    public ImpostoPessoaFisica(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public double calcularImposto() {
        return this.rendaAnual * 0.2;
    }

    public double getRendaAnual() {
        return this.rendaAnual;
    }
}
