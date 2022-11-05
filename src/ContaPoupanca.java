public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, Double saldo, Integer agencia, Integer numero) {
        super(cliente, saldo, agencia, numero);
    }

    String tipoConta;


    public ContaPoupanca(Cliente cliente, Double saldo, Integer agencia, Integer numero, String tipoConta) {
        super(cliente, saldo, agencia, numero);
        this.tipoConta = "ContaPoupanca";
    }

    @Override
    public void imprimirExtrato(){

        System.out.println(" -- Extrato conta poupança -- ");
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Numero: " + numero);
    }
}