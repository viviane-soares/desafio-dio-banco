package br.com.desafioBanco;

public class Main {
    public static void main(String[] args) {
        Conta  ccorrente = new ContaCorrente();
        Conta  poupanca = new ContaPoupanca();
        ccorrente.depositar(100);
        ccorrente.transferir(100, poupanca);

        ccorrente.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
