package br.com.nataliatsi.service;

import br.com.nataliatsi.model.Cliente;
import br.com.nataliatsi.model.Conta;

public class BancoService {

    public void criarConta(String nomeCliente,
            int numeroConta,
            String agencia,
            double saldo) {

        Conta conta = new Conta(numeroConta, agencia, saldo);
        Cliente cliente = new Cliente(nomeCliente, conta);

        exibirMensagem(cliente);

    }

    private void exibirMensagem(Cliente cliente) {
        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.\n",
                cliente.getNome(), cliente.getConta().getAgencia(), cliente.getConta().getNumeroConta(),
                cliente.getConta().getSaldo());

        System.out.println("---------------------------------------------------------");

    }

}
