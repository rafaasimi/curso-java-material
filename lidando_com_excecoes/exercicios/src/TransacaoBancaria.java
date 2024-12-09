public class TransacaoBancaria {

    public static void main(String[] args) {
        Conta conta = new Conta(100);

        conta.sacar(50);

        try {
            conta.sacar(100);
        } catch (SaldoInsuficienteException ex) {
            System.out.println("Saldo Insuficiente!");
            throw ex;
        }

    }
}
