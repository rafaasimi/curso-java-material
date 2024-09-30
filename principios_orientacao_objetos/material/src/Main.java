public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.ligarCarro();
        carro.acelerar();
        carro.frear();

        carro.setVolante("1");
        System.out.println(carro.getVolante());


//        System.out.println(carro.volante);
    }
}