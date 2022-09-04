package aulaPratica01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Cliente cliente_01 = new Cliente();
        cliente_01.setCpf("02850435902");
        cliente_01.setAnoNascimento(1980);
        cliente_01.setEmail("mr_souza@gmail.com");
        cliente_01.setNome("Marcos da Rocha Souza");

        Conta conta_01 = new Conta();
        conta_01.setNumero(1521);
        conta_01.setSaldo(750.63f);

        Cliente cliente_02 = new Cliente();
        cliente_02.setNome("Ana Clara Marques");
        cliente_02.setEmail("aninha@gmail.com");
        cliente_02.setCpf("03510400902");
        cliente_02.setAnoNascimento(1985);

        Cliente cliente_03 = new Cliente();
        cliente_03.setNome("Pedro de Alcantara");
        cliente_03.setEmail("pedro_75@gmail.com");
        cliente_03.setCpf("04564238906");
        cliente_03.setAnoNascimento(1975);

        Cliente cliente_04 = new Cliente();
        cliente_04.setNome("Pedro Andre Marcondes");
        cliente_04.setEmail("pedro@gmail.com");
        cliente_04.setCpf("03289078908");
        cliente_04.setAnoNascimento(1977);

        conta_01.debitaSaldo(100f);
        System.out.println(conta_01.getSaldo());

        conta_01.creditaSaldo(1000f);
        System.out.println(conta_01.getSaldo());
        System.out.println(conta_01.toString());

        Scanner teclado = new Scanner(System.in);
        Cliente cliente5 = new Cliente();

        System.out.println("Digite os dados do cliente.");
        System.out.println("Nome: ");
        cliente5.setNome(teclado.nextLine());

        System.out.println("CPF: ");
        cliente5.setCpf(teclado.nextLine());

        System.out.println("E-mail: ");
        cliente5.setEmail(teclado.nextLine());

        System.out.println("Ano de nascimento: ");
        cliente5.setAnoNascimento(teclado.nextInt());

        System.out.println(cliente5.toString());


        Conta conta_02 = new Conta();
        System.out.println("Número da conta: ");
        conta_02.setNumero(teclado.nextInt());
        System.out.println("Saldo da conta: ");
        conta_02.setSaldo(teclado.nextFloat());

        System.out.println("Digite um valor a ser debitado da conta: ");
        conta_02.debitaSaldo(teclado.nextFloat());
        conta_02.toString();
        System.out.println("Digite um valor a ser creditado na conta: ");
        conta_02.creditaSaldo(teclado.nextFloat());

        System.out.println(conta_02.toString());

    }
}
