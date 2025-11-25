public class Conta {

    private final Cliente cliente;
    private final Agencia agencia;
    private final int numeroConta;
    private double saldo;
    private final Extrato extrato;

    public Conta(Cliente cliente, Agencia agencia, int numeroConta, double saldoInicial) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.extrato = new Extrato();
    }

    public Conta(Cliente cliente, Agencia agencia, int numeroConta) {
        this(cliente, agencia, numeroConta, 0.0);
    }

    public void depositar(double valor) {
        registrarOperacao(new Operacao(TipoOperacao.DEPOSITO, valor));
        this.saldo += valor;
    }

    public void sacar(double valor) {
        registrarOperacao(new Operacao(TipoOperacao.SAQUE, valor));
        this.saldo -= valor;
    }

    private void registrarOperacao(Operacao operacao) {
        this.extrato.registrar(operacao);
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        String dadosConta = String.format("Conta: %d%nSaldo: %.2f%n%s",
                this.numeroConta, this.saldo, this.agencia);

        return "-----CLIENTE-----\n" +
                this.cliente +
                "\n\n" +
                "-----CONTA-----\n" +
                dadosConta +
                "\n\n" +
                "-----EXTRATO-----\n" +
                this.extrato.formatar() +
                "\n";
    }
}
