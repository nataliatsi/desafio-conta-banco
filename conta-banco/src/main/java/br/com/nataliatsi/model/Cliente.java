package br.com.nataliatsi.model;


public class Cliente {
    private String nome;
    private Conta conta;

    

    public Cliente(String nome, Conta conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }


    public Conta getConta() {
        return conta;
    }

    @Override
    public String toString() {
        return "Nome do cliente: " + nome + "\n" +
                "Dados da conta:" + "\n" +
                    "Número: " + conta.getNumeroConta() + "\n"+
                    "Agência: " + conta.getAgencia() + "\n" +
                    "Saldo: " + conta.getSaldo();
    }

}
