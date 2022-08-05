public class Main {

    public static void main(String[] args) {
        Cliente vinicius = new Cliente();
        vinicius.setNome("Vinicius");

        Conta cc = new ContaCorrente(vinicius);
        Conta poupanca = new ContaPoupanca(vinicius);

        cc.depositar(1);
        cc.transferir(10, poupanca );

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}