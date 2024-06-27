public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente("123456", 1000.0);
        Conta contaPoupanca = new ContaPoupanca("654321", 2000.0);

        Cliente cliente1 = new Cliente("Alice", contaCorrente);
        Cliente cliente2 = new Cliente("Bob", contaPoupanca);

        // Depósito
        cliente1.getConta().depositar(500);
        cliente2.getConta().depositar(300);

        // Saque
        cliente1.getConta().sacar(200);
        cliente2.getConta().sacar(100);

        // Transferência
        cliente1.getConta().transferir(cliente2.getConta(), 150);

        // Aplicar juros/taxas
        cliente1.getConta().aplicarJuros();
        cliente2.getConta().aplicarJuros();

        // Exibir saldos
        System.out.println("Saldo da conta corrente: " + cliente1.getConta().getSaldo());
        System.out.println("Saldo da conta poupança: " + cliente2.getConta().getSaldo());
    }
}