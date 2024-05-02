package br.com.nataliatsi;

import java.util.Scanner;
import java.util.InputMismatchException;
import br.com.nataliatsi.service.BancoService;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeCliente;
        String agencia;
        int numeroConta;
        double saldo;

        try {
            System.out.println("Por favor preencha os dados corretamente.");
            System.out.println("-------------------------------------------");

            System.out.println("Digite seu Nome: ");
            nomeCliente = scanner.nextLine();

            System.out.println("Digite o número da Conta: ");
            numeroConta = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o número da Agência: ");
            agencia = scanner.nextLine();

            System.out.println("Digite o Saldo: ");
            saldo = scanner.nextDouble();

            BancoService bancoService = new BancoService();
            bancoService.criarConta(nomeCliente, numeroConta, agencia, saldo);

        } catch (InputMismatchException e) {
            System.out.println("Dados inválidos. Não foi possível criar sua conta.");

        } catch (Exception e) {
            System.out.println("Não foi possível criar sua conta.");

        }

        scanner.close();

    }
}