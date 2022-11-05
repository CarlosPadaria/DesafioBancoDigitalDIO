public class Main {
    public static void main(String[] args) {

    Cliente cliente1 = new Cliente("Valdemar Padaria", "01987654321");
    Cliente cliente2 = new Cliente("Carlos Concecionaria", "12345678910");

    ContaCorrente contaCorrente = new ContaCorrente(cliente1, 23.0, 0, 0, "ContaCorrente");
    contaCorrente.imprimirExtrato();
    ContaPoupanca contaPoupanca = new ContaPoupanca(cliente2, 150d, 0, 0, "ContaPoupanca");
    contaCorrente.transferir(contaPoupanca, 100d);


    }
}