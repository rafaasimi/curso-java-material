package br.com.bb;

public class ContaBancariaBB {

    private String titular;
    private Double saldo;

    public ContaBancariaBB(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void atualizarSaldo(Double novoSaldo) {
        saldo += novoSaldo;
    }

    public String toString() {
        return "{ Titular: " + titular + ", Saldo: " + saldo + " }";
    }

}
