public class Conta {

    private Double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valorSaque) {
        if(valorSaque > this.saldo) {
            throw new SaldoInsuficienteException();
        }

        this.saldo -= valorSaque;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
