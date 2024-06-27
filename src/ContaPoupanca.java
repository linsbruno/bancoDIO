public class ContaPoupanca extends Conta {
    private static final double TAXA_JUROS = 0.02;

    public ContaPoupanca(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public void aplicarJuros() {
        double juros = super.getSaldo() * TAXA_JUROS;
        super.depositar(juros);
    }
}