package heranca;

public class Triangulo extends FiguraGeometrica{

    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        this.tipo = "Triangulo";
    }

    public Integer getArea() {
        return (this.base * this.altura) / 2;
    }

    public String toString() {
        return "{ base: " + this.base + ", altura: " + this.altura + ", tipo: " + this.tipo + " }";
    }

}
