public abstract class Conta {

    private static int agenciaPadrao = 1;
    private static int SEQUENCIAL = 1;

    protected Cliente cliente;
    protected Double saldo;
    protected Integer agencia;
    protected Integer numero;

    public Conta(Cliente cliente, Double saldo, Integer agencia, Integer numero) {
        this.cliente = cliente;
        this.saldo = saldo;
        this.agencia = Conta.agenciaPadrao;
        this.numero = SEQUENCIAL++;
    }


    public static int getAgenciaPadrao() {
        return agenciaPadrao;
    }

    public static void setAgenciaPadrao(int agenciaPadrao) {
        Conta.agenciaPadrao = agenciaPadrao;
    }

    public static int getSEQUENCIAL() {
        return SEQUENCIAL;
    }

    public static void setSEQUENCIAL(int SEQUENCIAL) {
        Conta.SEQUENCIAL = SEQUENCIAL;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void sacar(Double valor) {
        saldo -= valor;
    }

    public void depositar(Double valor) {
        saldo += valor;
    }

    public void transferir(Conta contaDestino, Double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("Você transferiu R$" + valor + " para " + contaDestino.cliente.getNome());
    }

    public void imprimirInformacoesConta(Conta conta) {
        System.out.println("Titular: " + conta.cliente.getNome());
        System.out.println("CPF: " + conta.cliente.getCpf());
        System.out.println("Agência: " + conta.getAgencia());
        System.out.println("Numero: " + conta.numero);
    }

    public void imprimirExtrato(Conta conta) {
        System.out.println("Saldo: " + conta.getSaldo());
        imprimirInformacoesConta(conta);
    }

    public abstract void imprimirExtrato();
}
