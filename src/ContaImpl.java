public interface ContaImpl {
    
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, ContaImpl contaDestino );

    void imprimirExtrato();
}
