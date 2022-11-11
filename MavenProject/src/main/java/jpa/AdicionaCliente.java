package jpa;

import pr.senac.br.controllers.TransactionController;
import pr.senac.br.modelo1.Cliente;
import pr.senac.br.modelo1.Conta;

import java.util.Scanner;

//DENTRO DO JPA E O MAIN DO PROGRAMA

public class AdicionaCliente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String response;

        System.out.println("Deseja cadastrar cliente? S ou N");
        response = teclado.nextLine();

        while (response.equalsIgnoreCase("s")) {

            Cliente cliente01 = new Cliente(); //instanciando novo cliente caso o usuario queria adicionar

            System.out.println("Digite o nome do cliente: ");
            cliente01.setNome(teclado.nextLine());

            System.out.println("Digite o CPF do cliente: ");
            cliente01.setCpf(teclado.nextLine());

            System.out.println("Digite o email do cliente: ");
            cliente01.setEmail(teclado.nextLine());

            System.out.println("Digite o ano de nascimento do cliente: ");
            cliente01.setAnoNascimento(teclado.nextInt());
            teclado.nextLine();

            Conta conta01 = new Conta(2000.99f); //instanciando nova conta
            cliente01.setConta(conta01);

            System.out.println("--------------------");
            TransactionController.transactionAdd(cliente01);

            System.out.println("ID tarefa: " + cliente01.getCpf());
            System.out.println("Cliente adicionado");

            System.out.println("Deseja cadastrar cliente? S ou N ");
            response = teclado.nextLine();
        }
    }
}
