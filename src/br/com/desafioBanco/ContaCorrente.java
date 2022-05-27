package br.com.desafioBanco;

public class ContaCorrente extends Conta {
    @Override
    public void imprimirExtrato() {

        System.out.println("== Extrato conta corrente ===");
        super.imprimirInforComuns();

    }}
