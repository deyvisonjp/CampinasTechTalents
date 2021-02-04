public class Conta {
    private String titular;
    private int numeroConta;
    private double saldo;

    public Conta(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // SACAR -------------------------------------------------------------------
    public void sacar(float valor) {
        if (valor >= saldo) {
            System.out.println("Valor indisponível");
        }
        saldo -= valor;
        System.out.println("Você sacou R$ " + String.format("%.2f", valor) + " - Seu saldo agora é de . . . R$ " +
                String.format("%.2f", saldo));
    }

    // DEPOSITAR ---------------------------------------------------------------
    public double deposito(double valor) {
        saldo += valor;
        System.out.println("Você depositou R$ " + String.format("%.2f", valor) + " - Seu novo saldo é de . . . R$ " +
                String.format("%.2f", saldo));
        return (saldo);
    }
}
