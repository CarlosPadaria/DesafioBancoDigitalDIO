public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, Double saldo, Integer agencia, Integer numero) {
        super(cliente, saldo, agencia, numero);
    }

    String tipoConta;


    public ContaCorrente(Cliente cliente, Double saldo, Integer agencia, Integer numero, String tipoConta) {
        super(cliente, saldo, agencia, numero);
        this.tipoConta = "ContaCorrente";
    }

    @Override
    public void imprimirExtrato(){

        System.out.println(" -- Extrato conta corrente -- ");
        System.out.println("Titular: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Agência: " + getAgencia());
        System.out.println("Numero: " + numero);
    }
}