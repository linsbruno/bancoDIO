public class ContaCorrente extends Conta {
    private static final double TAXA_MANUTENCAO = 10.0;

    public ContaCorrente(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public void aplicarJuros() {
        // Não aplica juros em conta corrente, mas cobra taxa de manutenção
        super.sacar(TAXA_MANUTENCAO);
    }
}