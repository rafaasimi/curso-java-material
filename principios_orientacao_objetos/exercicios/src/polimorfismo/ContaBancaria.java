package polimorfismo;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(int numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double vlrDeposito) {
        this.saldo += vlrDeposito;
    }

    public void sacar(double vlrSaque) {
        double novoSaldo = this.saldo - vlrSaque;

        if(novoSaldo < 0) {
            System.out.println("Saldo insuficiente.");
        } else {
            this.saldo = novoSaldo;
        }
    }

    public String toString() {
        return "{ numeroConta: " + this.numeroConta + ", titular: " + this.titular + ", saldo: " + this.saldo + " }";
    }
}
