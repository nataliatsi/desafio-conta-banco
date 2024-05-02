package br.com.nataliatsi.model;

public class Conta {
    private int numeroConta;
    private String agencia;
    private double saldo;

    public Conta(int numeroConta, String agencia, double saldo){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public String toString() {
        return "Agência: " + getAgencia() + "\n" +
                "Número da conta: " + getNumeroConta() + "\n" +
                "Saldo: " + getSaldo();
    }

}
